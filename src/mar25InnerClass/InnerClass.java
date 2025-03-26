package mar25InnerClass;

public class InnerClass {
    public void show(){
        System.out.println("Outer Class");
    }

    public class OuterClass {
        public void display(){
            System.out.println("Inner Class");
        }
    }


    public static void main (String[] args){
        // 1. Object for outerclass is required.
        InnerClass inner = new InnerClass(); // create object of outer class
        inner.show();
        // 2. with the reference of outerclass.new create inner class object
        // inner class object
        InnerClass.OuterClass outer = inner.new OuterClass(); // create object of inner class
        outer.display();
    }
}
