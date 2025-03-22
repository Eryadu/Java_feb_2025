package mar22Exceptions;

public class UserClass {
    private UserClass() {
    }

    public static UserClass uS;
    public static UserClass getInstance(){
        return uS;
    }
}
