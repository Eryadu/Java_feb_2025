package practice.MarkerInterface;

// Marker interface without any method nd field
interface logging{

}


//implementing marker interface on class
class User implements logging{
    String name;

}

public class CustomMarkerInterface{
    public static void main(String[] args) {
        User user = new User();

        if(user instanceof logging){
            System.out.println("Successful Login");
        }
    }
}