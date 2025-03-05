package Mar4;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Pragra";

        char temp;
        char[] ch1= new char[name.length()];
        for (int i =0 ; i< name.length() ; i++)
        {
             ch1[i] = name.charAt(i);
        }

        int len = ch1.length;
        for (int i =0 ; i< len; i++) {

            temp = ch1[0];
            ch1[i]=ch1[len-1];
            ch1[len-1]=temp;
            len--;
        }
        for (char ch2 : ch1)
        System.out.print( ch2);
    }
}
