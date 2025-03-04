package Mar1.Array;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 21,3,15,32};
         int temp = arr[0];
         for(int i =0 ; i < arr.length; i++)
         {
             if (temp<arr[i])
             {
                 temp = arr[i];

             }
         }
         System.out.println("Max Element is : " + temp);
    }
}
