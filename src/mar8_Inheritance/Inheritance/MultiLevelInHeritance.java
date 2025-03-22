package mar8_Inheritance.Inheritance;
class one {
    public  void display(){
        System.out.println("You are in Parent class (Class One)");
    }
}

class two extends one{
    public void display(){
        System.out.println("You are in Base class (Class Second) derived from Class One");
        super.display();
    }
}
public class MultiLevelInHeritance extends two {
    public static void main(String[] args) {
        MultiLevelInHeritance obj = new MultiLevelInHeritance();
        obj.display();

    }

}
