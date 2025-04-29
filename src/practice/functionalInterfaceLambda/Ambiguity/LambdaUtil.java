package practice.functionalInterfaceLambda.Ambiguity;

public class LambdaUtil {
    public void test (Adder adder){
        double x = 190.50;
        double y = 8.50;
        double sum = adder.add(x ,y );
        System.out.println("Using an Adder");
        System.out.println(x + " + " + y + " = " + sum);

    }

    public void test (Joiner joiner){
        String s1 = "hello";
        String s2 = "world";
        String s3 = joiner.join(s1, s2);
        System.out.println("Using joiner");
        System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");
    }

    public static void main(String[] args) {
        LambdaUtil util2 = new LambdaUtil();
        // remove ambiguity by declaring parameter type
        util2.test((double x , double y) -> x+y);
        util2.test((String s1 , String s2) -> s1+s2);

        // Calls the testJoiner() method. The Joiner will
// reverse the strings and join resulting strings in
// reverse order adding a comma in between
            util2.test((Joiner)(x, y) -> {
            StringBuilder sbx = new StringBuilder(x);
            StringBuilder sby = new StringBuilder(y);
            sby.reverse().append(",").append(sbx.reverse());
            return sby.toString();
        });
    }

}
