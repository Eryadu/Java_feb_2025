package april22EqualAndHashCode.Immutable;

public class CustomeMain  {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Student object creation
        Student student = new Student("Yad" , 07);

        //custom immutable object creation
        CustomImmutableDemo customImmutableDemo = new CustomImmutableDemo("ABC" , 200, student) ;

        // Printing immutable object
        System.out.println("Immutable Object : " + customImmutableDemo );

        // modifying mutable instance variable
        student.setStudentName("Gup");

        //printing immutable object values after modification
        System.out.println("Immutable Object after modification : " + customImmutableDemo);
    }
}
