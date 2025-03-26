package mar25InnerClass;

public class StaticInnerClass {

    public static void display(){
        System.out.println("You are in Static Outer Class.");
    }
    static class InnerClass{
        public void show(){
            System.out.println("You are in Static inner Class.");
        }
        public static void  set(){
            System.out.println("you are in Static Set method.");
        }

       static class InnerClass2{
            public void show2(){
                System.out.println("You are in Inner class of Inner.");
            }
       }
    }


    public static void main(String[] args){
        StaticInnerClass st = new StaticInnerClass();
        StaticInnerClass.display();
        StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass();
        innerClass.show(); // to access other method, need to create object of class.
        InnerClass.set(); // to access static method, use class name.

        StaticInnerClass.InnerClass.InnerClass2 inner2 = new InnerClass.InnerClass2();
        inner2.show2();
    }
}
