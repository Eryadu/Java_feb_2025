package mar15PolyMorAbstraction.Polymorphism;

public class MainCLass {
    public static void main(String[] args) {
        Shape sh = new Rectangle();
        System.out.println(sh.perimeter); // access variable of parent class only
       //upcasting (create the object of child class, but it refers to parent class during compile time)  // but at run
        // time it ref to actual (child class (method or variable)).

        // System.out.println(rectangle.perimeter); // we can't access rectangle variable, just access whatever (method or variable)
       //  in shape class (parent class) else other all variable or method are hidden. Property of PolyMorphism to hide data.

        System.out.println("Area of Rectangle is : " + sh.area());

    }
}