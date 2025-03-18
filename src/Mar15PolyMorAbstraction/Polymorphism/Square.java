package Mar15PolyMorAbstraction.Polymorphism;

public class Square extends Shape {
    double side = 10.00;
    // Method Override
    public double area(){
        return side*side;
    }
}
