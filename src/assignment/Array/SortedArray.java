package assignment.Array;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {10,2,21,22,5,32,1,45,6,345,0,8,54};
        System.out.print("Array Elements are : ");
        for(int nu : arr)
        {
            System.out.print( nu + " ");
        }
        System.out.println();
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = i+1 ; j < arr.length; j++ )
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array Elements are : ");
        for( int num : arr) {
            System.out.print(num + " ");
        }
    }

}
