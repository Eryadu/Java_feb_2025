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


