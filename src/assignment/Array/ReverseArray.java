package assignment.Array;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for ( int num : arr) {
            System.out.print ( num + " ");
        }
            int temp = 0, start = 0 , end = arr.length-1;
            while(start<=end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        for ( int num1 : arr) {
            System.out.print( num1 + " ");
        }
        }
}
