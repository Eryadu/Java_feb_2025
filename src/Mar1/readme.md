## variables
1. local variable
-- local to method or constructor

public void show (int x, int y)
{ int x;
}

2. instance variable
-- inside the class or outside method or constructor

class test{
int x;
}

3. static variable

-- static variable belongs to class rather than object of class. Its give the memory once.
-- static variable is shared among all the instances.
i.e. internet -- everyone is sharing single variable to save memory/ dividing speed among all
-- static variable are not stored in heap or stack, they are stored somewhere outside.

static int x =10;

-- Static Method -- We don't need to create object to call static method as it belongs to class not object of class.

## Memory
stack and heap

-- Stack -- is a data structure which work on FILO. It stores all the local variables


-- Heap -- it store object. Whenever obj are going to be refer it store in heap and variable in stack.
--Instance variable store in heap, cause it initialise by const by creating object, that's why they are in heap. // refer to ppt.

## object

Test test = new Test(int x ); -- whole is called object.
-- new keyword is used to give memory
-- test is reference variable only

## JVM, JRE (Java Run time Environment), JDK (Java Development Kit)??
## JVM (Java virtual machine) ----> jvm wants to call the main method
 that's why main method is static