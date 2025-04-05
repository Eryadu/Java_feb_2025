
## Collection -- Most imp

## Arraylist
internally its backed by Array
Its dynamic in nature

-- Elements are stored in order of insertion
-- Its also support null 
-- It supported duplicate elements 

?? Load factor


-- Internal Implementation of arraylist

// Java 7 /* List list = new ArrayList<>(); a default array of size 10 is created // threashold // Load Factor. : 75%

    need to create a new array
    of size

10 + 10/2 + 1     = 16
n + n/2 + 1
new array of size 16 is created.

if we know the size = array, 
if we don't know the size , it's going to grow dynamically = arraylist

     */
// Java 8

//  List<Integer> list = new ArrayList<>();
/*

    ## Lazy Initilization of arrayList
    array of size 0 is created.
    when you insert first element
    then array of size 10 will be created.

     */

## LinkedList
Singly LinkedList
Doubly LinkedList
LinkedList



-- for search operations ArrayList is preferred? Yes if there is more then a million number of elements with the index

-- for insertion linkedList ArrayList

if we have to add element at first/first occurrence in list which one we should use arraylist or linked-list - 1M elements 
We use linkedList, cause just change 1 or 2 reference rather shifting million elements to their right in Array
0 1 2.... 1M

Search /read operations 10 - 1M - ArrayList manipulation/ insertions or deletions - LinkedList

// add another filed as salary and find the employee name with highest salary.
// use java 8 streams api to find the highest salary. 