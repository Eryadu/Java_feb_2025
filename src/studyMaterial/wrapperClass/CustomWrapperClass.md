## Custom wrapper class in Java. A wrapper class is typically used to wrap a primitive value or an object to provide
   additional functionality, immutability, or utility methods.

Example: Custom Wrapper Class for int

public final class MyIntWrapper {
private final int value; // Immutable

    // Constructor
    public MyIntWrapper(int value) {
        this.value = value;
    }

    // Getter (no setter to maintain immutability)
    public int getValue() {
        return value;
    }

    // Additional utility methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    // Overriding toString() for better representation
    @Override
    public String toString() {
        return "MyIntWrapper{" + "value=" + value + '}';
    }

    // Example usage
    public static void main(String[] args) {
        MyIntWrapper wrapper = new MyIntWrapper(10);
        System.out.println(wrapper.getValue());  // 10
        System.out.println(wrapper.isEven());    // true
        System.out.println(wrapper.isPositive()); // true
    }
}

Key Points:

1. Immutable by Design (like Java's built-in wrappers Integer, Double, etc.)
2. Declare the field private final to prevent modification after construction.
3. Provide only a getter, no setter.
4. Additional Utility Methods
   You can add methods like isEven(), isPositive(), etc., to enhance functionality.
5. Override toString(), equals(), and hashCode()
   For better object representation and comparison.

6. ## Can be Generic
   You can make it generic to wrap any type:

   public final class MyWrapper<T> {
   private final T value;
   public MyWrapper(T value) { this.value = value; }
   public T getValue() { return value; }
   }

## Comparison with Java's Built-in Wrapper Classes

Feature	           Java's Wrapper (e.g., Integer)	               Custom Wrapper (e.g., MyIntWrapper)
Purpose	          Wraps primitives (int, double, etc.)	          Can wrap any type (primitives/objects)
Immutability	           Yes (final)	                              Yes (if designed that way)
Auto-boxing	            Supported (int ↔ Integer)	                 Not supported (manual wrapping)
Utility Methods	    Built-in (parseInt(), compare())	             Custom-defined (isEven(), etc.)
Extensibility	           Cannot modify	                             Fully customizable

## When to Use a Custom Wrapper?
-- When you need extra functionality around a primitive/object.
-- When you want strict control over modifications (immutability).
-- When Java’s built-in wrappers (Integer, Double, etc.) are insufficient.