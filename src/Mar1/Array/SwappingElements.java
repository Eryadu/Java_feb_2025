package Mar1.Array;

public class SwappingElements {
    public static void main(String[] args) {

    int [] arr = {1,2,3,4,5};
    int first=0;
    int last = arr.length-1;
    /*for ( int i=0 ; i< len/2; i++) {
    temp = arr[i];
    arr[i]=arr[len-1];
    arr[len-1] = temp;
    len--;
    }*/
while ( first< last){
    first = arr[first];
    arr[first]=arr[last-1];
    arr[last-1] = first;

    first++;
    last--;
}

    for( int e : arr)
    System.out.println(e);

    }

}
