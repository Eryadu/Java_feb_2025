package practice.innerClass;
// Nested Inner Class

public class NestedClass {
    void display(){
        System.out.println("Outer Class");
    }
    class InnerClass{
        void show(){
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args) {
        NestedClass.InnerClass obj = new NestedClass().new InnerClass();  // Method 1 without creating object of outer class in
                                                                           // non-static class
        obj.show();

        NestedClass nestedClass = new NestedClass(); // Method 2 by first creating obj of Outer class to create obj of inner class
        NestedClass.InnerClass obj2 = nestedClass.new InnerClass();
        obj2.show();
    }

}
