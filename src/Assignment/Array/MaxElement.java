package Assignment.Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {12,14,6,3,21};
        int max = arr[0];
        for (int i = 1 ; i< arr.length ; i++)
        {
            if(max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.println("Max Element is : " + max);
    }
}
