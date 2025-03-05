package Mar4;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*int [] []arr = {{10,20,30}, {40,50,60}};
        for (int [] num : arr)
        {
            for( int elements : num)
                System.out.println("Elements of array are : " + elements  );
        }*/

        int[][] arr = new int[2][3];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;

        for( int[] num : arr)
        {
            for (int elements : num) {
                System.out.println("Elements are :" + elements);

            }
        }

    }
}
