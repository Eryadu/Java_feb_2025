package practice.sortingInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    public  String brandName;
    public  String modelName;
    public  int price;

    public Car() {
    }

    public Car(String brandName, String modelName, int price) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.brandName.compareTo(o.brandName);
    }

}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Car> carList =  new ArrayList<>();
        carList.add(new Car("BMW", "X5" , 200000));
        carList.add(new Car("Mercedes", "AMG-5" , 120000));
        carList.add(new Car("Mazda", "Cx-9" , 100000));
        carList.add(new Car("Honda", "Civic" , 90000));
        carList.add(new Car("Genesis", "Jeep" , 95000));

        System.out.println("CarList before sorting : " + carList);

        // Sorting Car list based on BrandName
        Collections.sort(carList);
        System.out.println("CarList after sorting : " + carList);
        System.out.println();

        for(Car c : carList){
            System.out.println(c);
        }
    }
}
