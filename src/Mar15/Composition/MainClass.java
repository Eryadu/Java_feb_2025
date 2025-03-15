package Mar15.Composition;

public class MainClass {
    public static void main(String[] args){
        NameComposition nm1 = new NameComposition("A", "B", "C");
        NameComposition nm2 = new NameComposition("C", "D", "E");
        NameComposition nm3 = new NameComposition("G", "H", "I");
        NameComposition nm4 = new NameComposition("F", "D", "I");
        NameComposition nm5 = new NameComposition("H", "J", "N");

        Employee employee1 = new Employee("101", nm1, "abc@gmail.com", "Toronto", 100000.00 );
        Employee employee2 = new Employee("102", nm2, "cde@gmail.com", "Mississauga", 200000.00 );
        Employee employee3 = new Employee("103", nm3, "ghi@gmail.com", "Brampton", 300000.00 );
        Employee employee4 = new Employee("104", nm4, "fdi@gmail.com", "Scarborough", 400000.00 );
        Employee employee5 = new Employee("105", nm5, "hjn@gmail.com", "Etobikoc", 500000.00 );

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

        System.out.println(employee1.getName().getFirstName());
    }
}
