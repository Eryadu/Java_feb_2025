package Mar1.Array;

public class SwappingElements {
    public static void main(String[] args) {

    int [] arr = {1,2,3,4,5,7,8,9,21,12,1,21,32};
    int temp=0;
    int len = arr.length;
    for ( int i=0 ; i< len/2; i++) {
    temp = arr[i];
    arr[i]=arr[len-1];
    arr[len-1] = temp;
    len--;
    }

    for( int e : arr)
    System.out.println(e);

    }

}
