package practice.functionalInterfaceLambda.FunctionInterface;

import java.util.HashMap;
import java.util.function.*;

public class Employee {

    public  static HashMap<Integer, String> Emp = new HashMap<>();
    public static  void add(Integer ID , String name){
        if(!Emp.containsKey(ID)){
            Emp.put(ID, name);
        }
        else {
            System.out.println("Employee already Registered");;
        }
    }
    public static void main(String[] args) {
        add(1001, "Tim");
        add(1002, "John");
        add(1003, "Cris");
        add(1004, "Morgan");
        System.out.println(Emp);

        Function<Integer, String> empDetail = (Integer ID) -> {
            if (Emp.containsKey(ID))
                return Emp.get(ID);
            else
                return "Invalid ID";
        };

        // With the abstract method of Function Interface (apply()) we can get employee detail
        System.out.println("ID = 1002, Name = " + empDetail.apply(1005));



    }


       /* BiFunction<Integer, String, String> empDetail = (Integer ID, String name) ->
        {if(Emp.containsKey(ID) || Emp.equals(name) )
            return Emp.get(ID);
        else
            return "Invalid ID";
    };
        System.out.println("ID = 1002, Name = " + empDetail.apply(1002, "Tim"));

    }
}*/




}