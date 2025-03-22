package practice;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =1;
        while (scan.hasNext()){
            String s1 = scan.nextLine();
            System.out.println(i + " " + s1);
            i++;
        }
        scan.close();
    }
}
