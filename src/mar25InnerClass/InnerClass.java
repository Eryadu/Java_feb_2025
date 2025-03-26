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
        InnerClass inner = new InnerClass(); // create object of outer class
        inner.show();
        InnerClass.OuterClass outer = inner.new OuterClass(); // create object of inner class
        outer.display();
    }
}
