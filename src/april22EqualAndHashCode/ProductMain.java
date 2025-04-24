package april22EqualAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class ProductMain {
    public static void main(String[] args) {
        Map<Product, Integer> map = new HashMap<>();

        // First way to create object of product class
        map.put(new Product(101, "Mobile" , "Apple"), 1800);
        map.put(new Product(102, "Tablet" , "Samsung"), 1500);

        // Second way to create object of product class
        Product product1 = new Product(101, "Mobile" , "Apple");
        Product product2 = new Product(102, "Tablet" , "Samsung");

        // First way to pass key and get associated value
        System.out.println(map.get(new Product(102, "Tablet" , "Samsung")));

        // Second way to pass key and get associated value
        System.out.println(map.get(product2));

        System.out.println();
        // without implementing equal() and hashcode() method
        System.out.println("HashCode of Product1 : " + product1.hashCode()); // HC 2101973421
        System.out.println("HashCode of Product2 : " + product2.hashCode());// HC 1252169911
        System.out.println("Without implementing equal() and hashcode() method :" + map.get(product1)); // null
        System.out.println("Without implementing equal() and hashcode() method : " + map.get(product2)); // null

        System.out.println();
        // without implementing hashcode() method , implementing only Equal()
        System.out.println("HashCode of Product1 : " + product1.hashCode()); // HC 2101973421
        System.out.println("HashCode of Product2 : " + product2.hashCode());// HC 1252169911
        System.out.println("Without implementing hashcode() method , implementing only Equal() : " + map.get(product1)); //null
        System.out.println("Without implementing hashcode() method , implementing only Equal() : " + map.get(product2)); //null

        System.out.println();
        // without implementing equal() method , implementing only hashCode()
        System.out.println("HashCode of Product1 : " + product1.hashCode()); // HC -1341481412
        System.out.println("HashCode of Product2 : " + product2.hashCode());// HC -653495975
        System.out.println("Without implementing equal() method , implementing only hashCode() : " + map.get(product1)); //null
        System.out.println("Without implementing equal() method , implementing only hashCode() : " + map.get(product2)); //null

        System.out.println();
        //  implementing equal() method and hashCode()
        System.out.println("HashCode of Product1 : " + product1.hashCode()); // HC -1341481412
        System.out.println("HashCode of Product2 : " + product2.hashCode());// HC -653495975
        System.out.println("Implementing equal() method and hashCode() : " + map.get(product1)); //1800
        System.out.println("Implementing equal() method and hashCode() : " + map.get(product2)); //1500
    }
}
