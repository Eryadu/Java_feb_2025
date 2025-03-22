package mar22Exceptions;

public class NullPointerExceptionHandle {
    public static void main(String[] args) {
        String s = "Pragra";
        System.out.println(s);

        try{
            s= null;
            String uC = s.toUpperCase(); // it throws exception, cause it don't perform any function on null.

        }catch (NullPointerException e)
        {
            e.printStackTrace();
            System.out.println(s);
        }
        finally {
            System.out.println("Whatever you print in finally block, it will print.");
        }

    }
}
