## Java enum Strings
   In Java, we can get the string representation of enum constants using the toString() method or the name() method. 
   For example,

enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
public static void main(String[] args) {

      System.out.println("string value of SMALL is " + Size.SMALL.toString());
      System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());

}
}
Output
string value of SMALL is SMALL
string value of MEDIUM is MEDIUM

In the above example, we have seen the default string representation of an enum constant is the name of the same constant.

## Change Default String Value of enums
   We can change the default string representation of enum constants by overriding the toString() method. For example,

enum Size {
SMALL {

      // overriding toString() for SMALL
      public String toString() {
        return "The size is small.";
      }
},

MEDIUM {

     // overriding toString() for MEDIUM
      public String toString() {
        return "The size is medium.";
      }
};
}

class Main {
public static void main(String[] args) {
System.out.println(Size.MEDIUM.toString());
}
}
Output
The size is medium.
In the above program, we have created an enum Size. And we have overridden the toString() method for enum constants 
SMALL and MEDIUM.

Note: We cannot override the name() method. It is because the name() method is final.