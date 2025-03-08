package Mar8_Inheritance;

public class ToStringDemo {

    int id ;
    String s1 ;
    Double salary;

    @Override
    public String toString() {
        return "Employee Detail is : " +
                "id=" + id +
                ", s1='" + s1 + '\'' +
                ", salary=" + salary +
                '}';
    }

    public ToStringDemo(Double salary, int id, String s1) {
        this.salary = salary;
        this.id = id;
        this.s1 = s1;
    }
}
