package mar1.Array;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 21,3,15,32};
         int max = arr[0];
         int min = arr[0];
         for(int i =0 ; i < arr.length; i++)
         {
             if (max<arr[i])
             {
                 max= arr[i];

             }
             if (min >arr[i])
             {
                 min = arr[i];
             }
         }
         System.out.println("Max Element is : " + max);
        System.out.println("Min Element is : " + min);
    }
}
