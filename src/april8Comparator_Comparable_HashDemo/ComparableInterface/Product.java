package april8Comparator_Comparable_HashDemo.ComparableInterface;

// pass Product as comparable cause by default it compare String and integer
public class Product implements Comparable<Product>{
    public int productID;
    public String productDescription;
    public int productPrice;

    public Product(int productID, String productDescription, int productPrice) {
        this.productID = productID;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

   /* @Override
    public int compareTo(Product product) { // compare integer value
        return this.productID - product.productID;
    }*/

    // this is comparable interface method
    @Override
    public int compareTo(Product product) { // compare string value
        return this.productDescription.compareTo(product.productDescription);
    }
}
