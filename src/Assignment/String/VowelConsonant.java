package Assignment.String;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to check the count of Vowel and Consonants : ");
        String str = sc.next();
        //String str = "Hello World";

        int countVowel = 0;
        int countConsonants = 0;
        int countSpaces = 0;

        str = str.toLowerCase();

        for ( int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch== 'a' || ch== 'e' || ch== 'i' ||  ch== 'o' ||  ch== 'u')
            {   countVowel++;
            }
            else if (ch == ' ')
            {
                countSpaces++;
            }
             else
            {
                countConsonants++;
            }


        }
        System.out.println("Vowel Counts are : " + countVowel);
        System.out.println("Consonants Counts are : " + countConsonants);
        System.out.println("White Spaces :" + countSpaces);
    }
}
