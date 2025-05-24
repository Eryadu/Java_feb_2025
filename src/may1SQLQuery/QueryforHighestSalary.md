SELECT DISTINCT salary
FROM employees e1
WHERE 2 = (
SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > e1.salary
); 

🧠 Goal:
Get the 2nd highest salary from the employees table.

🔍 Step-by-Step Breakdown:

🔹1. Outer Query:
SELECT DISTINCT salary
FROM employees e1
...
This selects distinct salaries from the employees table (aliased as e1).
We're examining each salary one by one.
🔹2. WHERE Clause:
WHERE 2 = (
SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > e1.salary
);
This is the heart of the logic.

For each salary in e1, this subquery counts how many distinct salaries are greater than it in the same table
(employees, aliased as e2).
We're looking for the salary for which exactly 2 other distinct salaries are higher.
🔸 Example Walkthrough:
Let’s say the employees table contains these salaries:

salary
9000
8500
8000
7500
Let’s iterate through each row in e1:

👉 For e1.salary = 9000:

SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > 9000;
➡ No salary is greater → Count = 0 → WHERE 2 = 0 → ❌ Not selected.

👉 For e1.salary = 8500:

SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > 8500;
➡ One salary is greater (9000) → Count = 1 → WHERE 2 = 1 → ❌ Not selected.

👉 For e1.salary = 8000:

SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > 8000;
➡ Two salaries are greater (9000, 8500) → Count = 2 → ✅ WHERE 2 = 2 → ✅ Selected!

👉 For e1.salary = 7500:

➡ Three salaries are greater → Count = 3 → ❌ Not selected.

✅ So the final result is: 8000 ← the 2nd highest salary.

🧩 General Formula:

To get the N-th highest salary, you just change this line:

WHERE N = (
SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > e1.salary
);

Component	            Purpose
e1.salary	            Iterates over each salary to test
Subquery	            Counts how many unique salaries are higher
WHERE 2 = ...	        Filters for the salary that has exactly 2 salaries above it — the 3rd highest
This method is SQL-92 compliant and works in all versions of MySQL, including pre-8.0 (no window functions needed).


🎯 Goal:

Find the first, second, and third highest distinct salaries from the employees table.

✅ 1. First Highest Salary

This is the maximum salary:

SELECT MAX(salary) AS first_highest
FROM employees;
✅ 2. Second Highest Salary

Use a subquery to find the salary that has exactly one salary greater than it:

SELECT DISTINCT salary AS second_highest
FROM employees e1
WHERE 1 = (
SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > e1.salary
);
✅ 3. Third Highest Salary

Same idea — look for the salary with exactly two salaries greater than it:

SELECT DISTINCT salary AS third_highest
FROM employees e1
WHERE 2 = (
SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > e1.salary
);

If you want to return them all together as columns in a single row, you can use subqueries in the SELECT clause:

SELECT
(SELECT DISTINCT salary
FROM employees e1
WHERE 0 = (
SELECT COUNT(DISTINCT salary)
FROM employees e2
WHERE e2.salary > e1.salary
)
) AS first_highest,

    (SELECT DISTINCT salary
     FROM employees e1
     WHERE 1 = (
         SELECT COUNT(DISTINCT salary)
         FROM employees e2
         WHERE e2.salary > e1.salary
     )
     ) AS second_highest,

    (SELECT DISTINCT salary
     FROM employees e1
     WHERE 2 = (
         SELECT COUNT(DISTINCT salary)
         FROM employees e2
         WHERE e2.salary > e1.salary
     )
     ) AS third_highest;
🔹 Example Output:
first_highest	second_highest	third_highest
   9000	            8500	        8000



----------------------------------------------------------------------------------------------------------
## With Window Function we can calculate as well 
https://www.geeksforgeeks.org/window-functions-in-sql/

WITH RankedEmployee As (select EMPLOYEE_SALARY , DENSE_RANK() over( order by EMPLOYEE_SALARY desc)
AS Second_Rank
from EMPLOYEE)
select EMPLOYEE_SALARY as Second_Highest_Salary from RankedEmployee where Second_Rank=2;