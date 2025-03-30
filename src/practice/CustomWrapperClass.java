package practice;

// this class is immutable
public final class CustomWrapperClass {
    private final int x; // immutable


    // Constructor to initialize
    public CustomWrapperClass(int x) {
        this.x = x;
    }
    // Getter to get access the private members
    public int getX() {
        return x;
    }

    // custom methods to add additional functionality
    public boolean isEven(){
        return x%2 ==0;
    }
    public  boolean isPositive(){
        return x>0;
    }

    public static void main(String[] args) {
        CustomWrapperClass customWrapperClass = new CustomWrapperClass(4);
        System.out.println(customWrapperClass.getX());
        System.out.println(customWrapperClass.isEven());
        System.out.println(customWrapperClass.isPositive());
    }

}
