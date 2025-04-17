package practice.Collections.ArrayList.FunctionalInterface;

import java.util.HashMap;
import java.util.function.Function;


public class FunctionalTypeDemo {

    // to store details of the employee
    static HashMap<Integer, String> employee = new HashMap<>();
    // add method to add employee details to the hashmap
    public static void add(Integer ID, String name) {
        if (!employee.containsKey(ID)) {
            employee.put(ID, name);
        } else {
            System.out.println("Employee already Registered");
        }

    }


    public static void main(String[] args) {
        // function to get the name of the employee name from its id
        Function<Integer, String> getEmployee = (Integer ID) -> {
            if (employee.containsKey(ID)) {
                return employee.get(ID);
            } else {
                return "Invalid ID";
            }
        };

        // adding elements to the hashmap
        add(123, "ABC");
        add(124, "BBC");
        add(125, "CBC");
        add(126, "DBC");
        add(127, "EBC");

        // using getEmploye method (of Function) of Function to fetch name of the employee
        System.out.println("ID = 123, Name = " + getEmployee.apply(123));

    }
}