package april1_Lists_ArrayList;
import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {


    @Override
    public String toString() {
        return "ArrayListTest{}";
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // upcasting // List is interface and ArrayList is a class
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        // add element at particular index
        list.add(5,60);
        System.out.println(list);


        // to convert list to array
        Object[] objects = list.toArray(); // ArrayList is backed by Object array
        for (Object e : objects)
        {
           System.out.println(e);
        }


        // check collection is empty or not
        boolean ar = list.isEmpty();
        System.out.println(ar);


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(500);
        arr.add(600);

        // get index fo element
        System.out.println(arr);
        System.out.println(arr.get(3));

        // to search element in second collection
        boolean con = arr.contains(list);
        System.out.println(con);

        // two add two collections
        arr.addAll(list);
        System.out.println(arr);



    }
}
