package assignment.OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car : ");
        Car car = new Car("Mazda", "GT-6", 2015,4);
        car.carType();
        car.start();
        car.stop();
        car.displayInfo();
        System.out.println();

        System.out.println("Motorcycle : ");
        Motorcycle motorcycle = new Motorcycle("CBZ", "Sports" , 2012, 3);
        motorcycle.start();
        motorcycle.stop();
        motorcycle.displayInfo();
        System.out.println();

        System.out.println("Electric car : ");
        ElectricCar electricCar = new ElectricCar("Hyundai", "Tucson", 2024, 5, 1000);
        electricCar.carType();
        electricCar.chargeBattery();
    }
}
