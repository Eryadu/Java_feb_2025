package Assignment.String;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "Hello World";

        int k =3;

        System.out.println("Result : " + lengthOfLongestSubString( str, k));
    }

    public static String lengthOfLongestSubString(String s, int k)
    {
        String windowStr="";
        char[] ch = s.toCharArray();
        for( int right=0; right < k; right++) {
            windowStr += ch[right];
        }
        String maxStr = windowStr;

                for (int i = k; i <s.length(); i++)
                {
                    windowStr += ch[i]-ch[i-k];

            }


        return windowStr;
    }
}
