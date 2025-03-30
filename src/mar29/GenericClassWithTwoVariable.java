package mar29;
// generic class represent by angular brackets <> with any type of datatypes
// generic class with two data types
public class GenericClassWithTwoVariable<C1, C2> {
    C1 name;
    C2 id ;

    // create constructor
    public GenericClassWithTwoVariable(C1 name, C2 id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        // create object of generic class for type safety and flexibility, declare data type what type of input we expect
        GenericClassWithTwoVariable< String, Integer> genericClass = new GenericClassWithTwoVariable<>("ABC", 12); // we pass two data type
                                                                  // because we take two types in generic class above
        /*genericClass.id = 13;
        genericClass.name = "cde";*/
        System.out.println(genericClass);

    }
}

// generic class with one data type
class GenericClass1<C1> {
    C1 name;
    C1 id ;

    // create constructor
    public GenericClass1(C1 name, C1 id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        // create object of generic class for type safety and flexibility, declare data type what type of input we expect
        GenericClass1< String> genericClass = new GenericClass1<>("ABC", "12"); // we pass one data type
        // because we take one types in generic class above
        /*genericClass.id = 13;
        genericClass.name = "cde";*/
        System.out.println(genericClass);

        // we can create generic class object as we want with different data type as they provide type safety and flexibility
        GenericClass1<Integer> genericClass1 = new GenericClass1<>(1, 2);
        System.out.println(genericClass1);


    }
}