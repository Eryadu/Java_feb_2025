package Mar8_Inheritance.Inheritance;
class One1 {
    public void printOne()
    {
        System.out.println("PrintOne() print class one.");
    }
}
class Two1 extends One1{
    public void printSecond(){
        System.out.println("PrintSecond() print class two");
    }
}

public class HieraricalInHeritance extends One1 {
    public static void main(String[] args) {
        One1 one = new One1();
       HieraricalInHeritance hr = new HieraricalInHeritance();

       one.printOne();
       hr.printOne();


    }
}
