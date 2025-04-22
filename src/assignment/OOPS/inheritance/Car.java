package assignment.OOPS.inheritance;

public class Car extends Vehicle{

    int numberOfDoor;

    public Car(String make, String model, double year, int numberOfDoor) {
        super(make, model, year);
        this.numberOfDoor = numberOfDoor;
    }

    void carType(){
        System.out.println("Type of Car like Hybrid, Diesel,Gas");
    }

    @Override
    public void start() {
        System.out.println("Start mechanism of Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Mechanism of Car");
    }

    @Override
    public void displayInfo() {
        System.out.println("Display Info of Car");
        System.out.println("Car Make : " + make);
        System.out.println("Car Model : " + model);
        System.out.println("Car year : " + year);
        System.out.println("Car Number of Doors  : " + numberOfDoor);
    }
}
