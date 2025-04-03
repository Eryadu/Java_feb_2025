package practice.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {


        // Shopping cart using ArrayList
        List<Product> cart = new ArrayList<>();

        // Add products
        cart.add(new Product("Iphone", "100$"));
        cart.add(new Product("Samsung", "90$"));
        System.out.println("Items in cart are : " + cart);

    }
}
/*


    // Calculate total
    double total = cart.stream()
            .mapToDouble(Product::getPrice)
            .sum();

// Remove expensive items
cart.removeIf(p -> p.getPrice() > 500);

// Checkout
if (!cart.isEmpty()) {
        checkout(cart);
    }*/