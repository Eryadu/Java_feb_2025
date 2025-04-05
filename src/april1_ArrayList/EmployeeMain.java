package april1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("ABC", 101, 10000.0));
        list.add(new Employee("BCD", 102, 20000.0));
        list.add(new Employee("DEF", 103, 30000.0));
        list.add(new Employee("EHI", 104, 40000.0));
        list.add(new Employee("JKL", 105, 50000.0));

        System.out.println("List of Employee are : " + list);

        Employee maxSalary = list.get(0);  // get first employee detail
        for ( Employee e : list){
            if(e.empSalary > maxSalary.empSalary){   // compare first with all others employee
                maxSalary = e ;
            }
        }
        System.out.println("Max salary is : " + maxSalary);

    }
}


/*

// add another filed as salary and find the employee name with highest salary.
// use java 8 streams api to find the highest salary. - Later*/
