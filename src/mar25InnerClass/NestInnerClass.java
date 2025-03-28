package mar25InnerClass;

public class NestInnerClass {
    public void show(){
        System.out.println("Outer Class");
    }

    public class InnerClass {
        public void display(){
            System.out.println("Inner Class");
        }
    }


    public static void main (String[] args){
        // 1. Object for outer class is required.
        NestInnerClass inner = new NestInnerClass(); // create object of outer class.         ## Syntax 1
        inner.show();
        // 2. with the reference of outer class.new create inner class object
        // inner class object
        NestInnerClass.InnerClass outer = inner.new InnerClass(); // create object of inner class
        outer.display();

       // OuterClass.InnerClass out = new OuterClass().new InnerClass();              ## Syntax 2

    }
}
