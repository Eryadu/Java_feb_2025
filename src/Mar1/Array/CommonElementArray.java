package Mar1.Array;

public class CommonElementArray {
    public static void main(String[] args) {
         int [] arr1 = {1,2,3,4,5};
         int [] arr2 = {6,2,3,9,10};
         int arr3;
         for (int i = 0 ; i < arr1.length; i++)
         {
             for(int j =0 ;  j< arr2.length ;j++) {
                 if (arr1[i] == arr2[j]) {
                     arr3 = arr1[i];
                     System.out.println(arr3);
                 }
                 }
             }
         }

    }

