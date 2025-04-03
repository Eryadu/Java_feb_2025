package practice.Collections.ArrayList;

public class Product {
        String pName;
        String pCost;

        public Product(String pName, String pCost)
        {this.pName = pName;
            this.pCost = pCost;
        }

    @Override
    public String toString() {
        return "Product{" +
                "pName='" + pName + '\'' +
                ", pCost='" + pCost + '\'' +
                '}';
    }
}
