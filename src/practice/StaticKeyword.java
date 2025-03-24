package practice;

public class StaticKeyword {

        static int x;
        static int count = 0; // Static variable

        StaticKeyword() { // Default constructor
            count++; // Increment count each time an object is created
        }

    static class innerClass {
        static void display() {
            System.out.println("Nested Static class");
        }
    }

        public static void main(String[] args) {
            StaticKeyword c1 = new StaticKeyword();
            StaticKeyword c2 = new StaticKeyword();
            System.out.println("Total objects created: " + StaticKeyword.count); // Output: 2
            innerClass obj = new innerClass(); // Static inner class object
            obj.display();




        }
    static {//Static block:used to initialise static variable
            x = 10;
            System.out.println("Static Block Executed.");
    }

    }

