package practice.Collections.ArrayList;


interface logging{ // Marker interface without any method nd field

}

class User implements logging {        //implementing marker interface on class
    String name;
}


public class CustomMarkerInterface{
    public static void main(String[] args) {
        User user =  new User();
        if (user instanceof logging)
        {
            System.out.println("Login Successfully");
        }

    }
}