package mar22Exceptions;

import java.util.Scanner;

public class ArrayOutOfBoundException {

    /*nullpointer
    Arrayindexoutofbound
            arithemetic */
    public static void main(String[] args) {

        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        try
        {
            for (int i =0 ; i <= 6; i++){
                arr[i]= sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getStackTrace();
        }
        for (int num : arr)
        {
            System.out.println(num);
        }

    }
}
