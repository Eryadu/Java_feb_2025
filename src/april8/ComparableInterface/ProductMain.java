package april8.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain{
    public static void main(String[] args) {

        // Product product = new Product(102, "Dbc", 110);
        // Product product = new Product(104, "BZc", 120);
        // Product product = new Product(101, "CDc", 130);
        // Product product = new Product(103, "AJc", 140);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(102, "Dbc", 110));
        productList.add(new Product(104, "BZc", 120));
        productList.add(new Product(101, "CDc", 130));
        productList.add(new Product(103, "AJc", 140));

        System.out.println("Product list before sorting : " + productList);

        // Sort based on Product Description

        Collections.sort(productList); // to sort custom list use comparable<> interface
        System.out.println("Product list after sorting : " + productList);
    }
}
