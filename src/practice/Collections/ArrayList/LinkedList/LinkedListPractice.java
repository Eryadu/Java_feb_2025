package practice.Collections.ArrayList.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Pines");
        System.out.println("Linked List with object of LinkedList is : " + list);

        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Linked List with ref to List interface is : " + list1);


       // list1.addFirst // this method is not in List Interface

        list.addFirst("B"); // Insert at head (O(1))
        list.addLast("C"); // Same as add() (O(1))
        list.add(1, "D"); // Insert at index (O(n))
        //list.addAll(otherList); // Add collection (O(n))
        System.out.println("Updated Linked List is : " + list);



        list.remove(); // Remove head (O(1))
        list.remove("C"); // By object (O(n))
        list.remove(2); // By index (O(n))
       // list.removeFirst(); // O(1)
        //list.removeLast(); // O(1)
        System.out.println("Linked List after remove method is : " + list);

        String first = list.getFirst(); // O(1)
        System.out.println("First element is :" + first);
        String last = list.getLast(); // O(1)
        System.out.println("last element is :" + last);

        list.offer("X"); // Add to end (O(1))
        System.out.println("Added element is :" + list);
        list.poll();// Remove head (O(1))
        System.out.println("Removing head is :" + list);
        list.peek(); // View head (O(1))
        System.out.println("view head is :" + list);
    }
}
