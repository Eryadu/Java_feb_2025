package mar1;

public class Employee {

       int id;
       String name;
       String email;
       static String company = "Pragra";

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void empDetail(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(company);
    }
}
