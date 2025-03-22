package practice;

import java.util.Scanner;

public class SubStringLargeSmall {
    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i + k <= s.length(); i++) {

            String myWord = s.substring(i, i + k);

            if (smallest.compareTo(myWord) > 0) {

                smallest = myWord;

            }else
                largest = myWord;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        System.out.println("Enter the length of substring : ");
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}