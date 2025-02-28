package Practice;

import java.util.Collections;
import java.util.Scanner;

public class ArrayListLargeSmall {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    System.out.println("Enter the length of substring : ");
    int k = sc.nextInt();
    String smallest = "";
    String largest = "";

    sc.close();

    java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

        if ((i + k) <= s.length()) {
            arrayList.add(s.substring(i, i + k));
        }
    }

    smallest = Collections.min(arrayList);
    largest = Collections.max(arrayList);

    System.out.println(smallest + "\n" + largest);
}
}


