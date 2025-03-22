package mar15PolyMorAbstraction.Composition;

public class MainClass {
    public static void main(String[] args){
        NameComposition nm1 = new NameComposition("A", "B", "C");
        NameComposition nm2 = new NameComposition("C", "D", "E");
        NameComposition nm3 = new NameComposition("G", "H", "I");
        NameComposition nm4 = new NameComposition("F", "D", "I");
        NameComposition nm5 = new NameComposition("H", "J", "N");

        AddressComposition addressComposition1 = new AddressComposition("12","Dundas", "Toronto", "Canada", "M1T");
        AddressComposition addressComposition2 = new AddressComposition("12","Dundas", "Toronto", "Canada", "M1T");
        AddressComposition addressComposition3 = new AddressComposition("12","Dundas", "Toronto", "Canada", "M1T");
        AddressComposition addressComposition4 = new AddressComposition("12","Dundas", "Toronto", "Canada", "M1T");
        AddressComposition addressComposition5 = new AddressComposition("12","Dundas", "Toronto", "Canada", "M1T");


        Employee employee1 = new Employee("101", nm1, "abc@gmail.com", addressComposition1, 100000.00 );
        Employee employee2 = new Employee("102", nm2, "cde@gmail.com", addressComposition2, 200000.00 );
        Employee employee3 = new Employee("103", nm3, "ghi@gmail.com", addressComposition3, 300000.00 );
        Employee employee4 = new Employee("104", nm4, "fdi@gmail.com", addressComposition4, 400000.00 );
        Employee employee5 = new Employee("105", nm5, "hjn@gmail.com", addressComposition5, 500000.00 );

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

        System.out.println(employee1.getName().getFirstName()); // it helps to search the employee with name(first, last, middle)
        System.out.println(employee1.getAddress().getAptNum());
    }
}
