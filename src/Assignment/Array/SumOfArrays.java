package Assignment.Array;

public class SumOfArrays {

    public static void main(String[] args) {
        int sum =0 ;
        int [] [] arr1 = {{54,12,4}, {2,36,40}, {6,4,5}};
        int [] [] arr2 = {{2,9,40}, {5,3,6}, {3,5,12}};
        int [] [] arr3 = new int[3][3];

        for ( int i = 0 ; i < arr1.length ; i++)
        {
            for ( int j =0 ; j < arr2.length ; j++)
            {
                arr3 [i] [j] = arr1 [i][j] + arr2 [i] [j];
                sum += arr1 [i][j] + arr2 [i] [j];
            }
        }
        for ( int i = 0 ; i < arr3.length ; i++)
        {
            for ( int j =0 ; j < arr3.length ; j++)
            {
                System.out.print(arr3[i][j] + " ");
            } System.out.println();
        }
        System.out.println();
        System.out.println("Sum of Array is :" + sum);
    }
}
