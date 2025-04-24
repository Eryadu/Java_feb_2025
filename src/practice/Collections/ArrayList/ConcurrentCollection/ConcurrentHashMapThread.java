package practice.Collections.ArrayList.ConcurrentCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThread  extends Thread{
// static HashMap m  = new HashMap(); // It throws ConcurrentModificationException
    static ConcurrentHashMap m = new ConcurrentHashMap();
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Child Thread updating Map");
        m.put(103, "C");
    }
        public static void main(String[] args) {
        m.put(101,"A");
        m.put(102,"B");
        ConcurrentHashMapThread t = new ConcurrentHashMapThread();
        t.start();
        Set s = m.keySet();
            Iterator itr = s.iterator();
            while(itr.hasNext()){
                Integer i1 = (Integer) itr.next();
                System.out.println("Main Thread iterating and current Entry is : " + i1 + "--------" + m.get(i1));// return
                                                                                                // key and associated value
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println(m);
        }
    }
// Update and We won't get any ConcurrentModificationException
// If we replace ConcurrentHashMap with HashMap, then we will get ConcurrentModificationException

// it's not guaranteed, chile thread update will be available to main thread iterator. Sometime available sometime not
