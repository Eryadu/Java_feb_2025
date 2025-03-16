## Diff between method overloading and overriding?

## Rules of Overriding
1. Arguments must be the same, and return types must be compatible with superclass.The contract of superclass defines how 
   other code can use a method. Whatever the superclass takes as an argument, the subclass overriding the method must use 
   that same argument. And whatever the superclass declares as a return type, the overriding method must declare either the 
   same type or a subclass type. Remember, a subclass object is guaranteed to be able to do anything its superclass declares,
   so it’s safe to return a subclass where the superclass is expected.

2. The method can’t be less accessible.
   That means the access level must be the same, or friendlier. You can’t, for example, override a public method and make it
   private.What a shock that would be to the code invoking what it thinks (at compile time) is a public method, if suddenly 
   at runtime the JVM slammed the door shut because the overriding version called at runtime is private!


## Rules for Overloading a method
Method overloading is nothing more than having two methods with the same name but different argument lists. Period. 
There’s no polymorphism involved with overloaded methods!Overloading lets you make multiple versions of a method, with 
different argument lists, for convenience to the callers. For example, if you have a method that takes only an int, the 
calling code has to convert, say, a double into an int before calling your method. But if you overloaded the method with 
another version that takes a double, then you’ve made things easier for the caller. 
Since an overloading method isn’t trying to fulfill the polymorphism contract defined by its superclass,
overloaded methods have much more flexibility.
1. The return types can be different. You’re free to change the return types in overloaded methods, as long as the 
   argument lists are different.
2. You can’t change ONLY the return type. If only the return type is different, it’s not a valid overload—the compiler 
   will assume you’re trying to override the method. And even that won’t be legal unless the return type is a subtype of 
   the return type declared in the superclass. To overload a method, you MUST change the argument list, although you can
   change the return type to anything.
3. You can vary the access levels in any direction. You’re free to overload a method with a method that’s more restrictive. 
   It doesn’t matter, since the new method isn’t obligated to fulfill the contract of the overloaded method.

-- An overloaded method is just a different method that happens to have the same method name. It has nothing
   to do with inheritance and polymorphism. An overloaded method is NOT the same as an overridden method.

-- Legal examples of method overloading:
   public class Overloads {
     String uniqueID;
     public int addNums(int a, int b) {
      return a + b;
     } 
     public double addNums(double a, double b) {
      return a + b;
     }
     public void setUniqueID(String theID) {
     // lots of validation code, and then:
      uniqueID = theID;
     }
     public void setUniqueID(int ssNumber) {
     String numString = "" + ssNumber;
      setUniqueID(numString);
    }

