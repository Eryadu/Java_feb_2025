package april22EqualAndHashCode;
import java.util.*;
public class TestingEqualHashCode {

        int id;

        // Constructor
        TestingEqualHashCode(int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id; // custom hashCode
        }

        // equals() is NOT overridden

        public static void main(String[] args) {
            Map<TestingEqualHashCode, String> map = new HashMap<>();

            TestingEqualHashCode p1 = new TestingEqualHashCode(1);
            TestingEqualHashCode p2 = new TestingEqualHashCode(1); // same id as p1, so same hashCode

            map.put(p1, "Alice");
            map.put(p2, "Alice");

            System.out.println("P1 HashCode : " + p1.hashCode()); // P1 HashCode : 1
            System.out.println("P2 HashCode : " + p2.hashCode()); // P2 HashCode : 1
            System.out.println(map.get(p1)); // prints "Alice" // == (ref ) match
            System.out.println(map.get(p2)); // prints null by default equal use == (ref check), ref didn't match
        }
    }


