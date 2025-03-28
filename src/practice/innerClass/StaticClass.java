package practice.innerClass;

class Outer {
    static void outerMethode(){
        System.out.println("Outer Static method");
    }
    static class Inner {
        /*void innerMethod(){ // non static method
            System.out.println("Inner Static method");
        }*/
        static void innerMethod(){ // static method
            System.out.println("Inner Static method");
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Outer.outerMethode(); /// accessing outer class static method without creating object.
        Outer.Inner.innerMethod(); // accessing inner class static method with class name -----> Method 1
        /*Outer.Inner obj = new Outer.Inner(); // if method is not static then create obj to access
        obj.innerMethod();*/
    }
}
