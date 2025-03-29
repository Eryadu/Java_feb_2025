package practice.innerClass;

// Anonymous class as implementer of Interface

interface Hello{
    void greet1();
}

class AnonymousClass{
   static Hello obj = new Hello() { /// declare static cause without static cannot access in main method
                                    /// in static we can access only static method
        @Override
        public void greet1() {
            System.out.println("Greet method");
        }
    };
        public static void main(String[] args) {
            obj.greet1();
        }
}


// Anonymous class as a subclass of the specified type (Extending class)

class Outer2{
    void show(){
        System.out.println("Outer Show Method");
    }
}

class Inner2{
    static Outer2 obj = new Outer2(){
        @Override
        void show() {
            super.show();
            System.out.println("Inner Show Method");
        }
    };
public static void main (String[] args){
    obj.show();
}
}
