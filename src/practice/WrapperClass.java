package practice;

public class WrapperClass {
    public static void main(String[] args) {
        int x= 5;
        float y = 2.00f;
        long z = 20000;


        // Autoboxing
        Integer intObj = x;
        Float floObj = y;
        Long loObj = z;
        //Integer intObj =5; similar thing

        System.out.println(intObj);
        System.out.println(floObj);
        System.out.println(loObj);
        System.out.println(intObj.intValue()); // with Object, we can access many method
        System.out.println(Integer.MAX_VALUE); // even with class we can access multiple method , max value of Integer
        System.out.println(Integer.MIN_VALUE); // min value an integer can hold

        //UnBoxing
        Integer intObj1 = 5;
        Float floObj1 = 10.00f;
        Double doObj1 = 20000.00000;

        int x1 = intObj1;
        float y1 = floObj1;
        double z1 = doObj1;
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);



    }
}
