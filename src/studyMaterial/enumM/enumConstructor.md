## Java enum Constructor
In Java, an enum class may include a constructor like a regular class. These enum constructors are either

-- private - accessible within the class
or
-- package-private - accessible within the package

## Example: enum Constructor
enum Size {

// enum constants calling the enum constructors
SMALL("The size is small."),
MEDIUM("The size is medium."),
LARGE("The size is large."),
EXTRALARGE("The size is extra large.");

private final String pizzaSize;

// private enum constructor
private Size(String pizzaSize) {
this.pizzaSize = pizzaSize;
}

public String getSize() {
return pizzaSize;
}
}

class Main {
public static void main(String[] args) {
Size size = Size.SMALL;
System.out.println(size.getSize());
}
}
Output:
The size is small.

## In the above example, we have created an enum Size. It includes a private enum constructor. The constructor takes a 
   string value as a parameter and assigns value to the variable pizzaSize.

-- Since the constructor is private, we cannot access it from outside the class. However, we can use enum constants 
   to call the constructor.

-- In the Main class, we assigned SMALL to an enum variable size. The constant SMALL then calls the constructor Size 
   with string as an argument.
-- Finally, we called getSize() using size.

