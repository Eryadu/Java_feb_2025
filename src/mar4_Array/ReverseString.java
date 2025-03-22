package mar4_Array;

public class ReverseString {
    public static void main(String[] args) {
        String name = "I am a Java Programmer";
        char[] ch = name.toCharArray();

        char temp;
        int len = ch.length;
        for (int i =0 ; i< len; i++) {

            temp = ch[i];
            ch[i]=ch[len-1];
            ch[len-1]=temp;
            len--;
        }
        for (char ch2 : ch)
        System.out.print( ch2);

        /*String rev = "";
        for (int i = name.length()-1; i>=0 ; i--)
        {
            rev += ch[i];
        }
        System.out.println("Reverse string is : " + rev);*/
    }
}
