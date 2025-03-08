package Assignment.Array;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {10,2,21,22,5};
        int secondMax = 0, firstMax = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 1 ; j < arr.length; j++)
            {
                if(arr[i]> arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;

                }
            }
        }
        for( int num : arr)
        System.out.println(num);
    }

}
