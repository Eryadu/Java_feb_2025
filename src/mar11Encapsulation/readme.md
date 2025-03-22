Super constructor? Always first to call
this constructor ? Always first to call

both "this" and "super" constructor cannot call from same constructor because it's always first either super or this.
we can use i.e. this.variable = super.variable by this.
 
## Note... If we declare this(); inside the constructor then it will call recursively to the same constructor.
i.e. 
public class Car extends Vehicle{

    int fuelCap = 100;

    public Car() {

        //this();  // Car class default constructor  , this should be the first statement in constructor body
        // super(); has to be the first statement in constructor body
        // this.fuelCap = super.fuelCap; We can solve the problem using like that.
    }

    @Override
    public void display() {
        super.show();
        System.out.println("Fuel capacity " + super.fuelCap );
    }
}

// super keyword  - super class
// this keyword - refer to this current class object


Child class constructor call Parent class constructor by using Super keyword.
## Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

- Declare class variables/attributes as private
- Provide public get and set methods to access and update the value of a private variable

Wraps the data into single unit...
programmer can control who can access what.. (i.e. wi-fi password)

## Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

## getter & setter
By-default you should make all the fields/ data members as private no one can access it outside.To access these private
members we use the Getter and Setter method.
With the help of getter - user can read only.
With the help of setter - user can write only.

