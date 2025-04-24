package april22EqualAndHashCode;

import java.util.Objects;

public class Product {
   private int productID;
   private String productName;
   private String productBrand;

    public Product(int productID, String productName, String productBrand) {
        this.productID = productID;
        this.productName = productName;
        this.productBrand = productBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Objects.equals(productName, product.productName) && Objects.equals(productBrand, product.productBrand);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, productBrand);
    }
}
