package Assignment.Array;

public class CharArray {
    public static void main(String[] args) {
        /*char[] ch  = {'A', 'B', 'C', 'D' };
        for (char c : ch)
        {
            System.out.print(c + " ");
        }*/

        String str = "ABCD";
        char[] ch = str.toCharArray();
        for (char c : ch)
        {
            System.out.print(c + " ");
        }
    }
}
