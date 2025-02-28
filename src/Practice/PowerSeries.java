package Practice;

import java.util.Scanner;

public class PowerSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number of queries");
        int t = in.nextInt();
        for (int i = 0; i < t; i++) { // number of queries
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) { // increase the series
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " "); // print series
            }
            System.out.println(); // print in new line
        }

        in.close();
    }
}
