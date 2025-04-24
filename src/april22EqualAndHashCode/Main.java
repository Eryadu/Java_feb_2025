package april22EqualAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Employee, Integer> salaries = new HashMap<>();
        salaries.put(new Employee(1, "Neeraj", "S", "neeraj@test.com"), 11000);
        salaries.put(new Employee(2, "Yad", "G", "yad@test.com"), 12000);

        /*System.out.println(salaries);
        System.out.println(salaries.keySet());*/

        // this code is without implementing equal() and hashcode().
//        System.out.println(salaries.get(new Employee(1, "Neeraj", "P"))); // return null because
//        // we didn't implement the equal() and hashcode() method, so it will calculate the default hashcode.
//
//        Employee e1 = new Employee(1, "Yad", "G");
//        Employee e2 = new Employee(1, "Yad", "G");
//        System.out.println("HashCode of e1 : " + e1.hashCode()); // HashCode of e1 : 1252169911
//        System.out.println("HashCode of e2 : " + e2.hashCode()); // HashCode of e2 : 2101973421

// this code is with equal and hashcode method
        System.out.println(salaries.get(new Employee(1, "Neeraj", "S", "neeraj@test.com"))); // 11000
        Employee e1 = new Employee(1, "Yad", "G","yad@test.com");
        Employee e2 = new Employee(1, "Yad", "G", "yad@test.com");
        System.out.println("HashCode of e1 : " + e1.hashCode()); // HashCode of e1 : 1277246270
        System.out.println("HashCode of e2 : " + e2.hashCode()); // HashCode of e1 : 1277246270

        e1.setEmialID("yadg@test2.com");
        System.out.println("HashCode of e1 : " + e1.hashCode()); // HashCode of e1 : -646993997 HC change with change the value
        System.out.println(salaries.get(new Employee(2, "Yad", "G", "yad@test.2com"))); // return null
                                                                                              // hashcode will not match
        // HC only calculated in Put() and get() method so if we update the value it updated the HC as well.
    }
}
