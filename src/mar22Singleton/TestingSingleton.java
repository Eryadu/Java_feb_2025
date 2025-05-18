package mar22Singleton;

public class TestingSingleton {
    private static final TestingSingleton intsa = new TestingSingleton();

    private TestingSingleton(){

    }
    public static TestingSingleton getIntsa() // this is getter method to give access to private method.So you can choose any name
    {
        return intsa;
    }


    public static void main(String[] args){
        TestingSingleton s1 = TestingSingleton.getIntsa();
        TestingSingleton s2 = TestingSingleton.getIntsa();
        if(s1==s2){
            System.out.println("Hashcode of s1 : " + s1.hashCode());
            System.out.println("Hashcode of s2 : " + s2.hashCode()); // Hashcode of s1 : 1975012498
                                                                     // Hashcode of s2 : 1975012498
        }

    }
}
