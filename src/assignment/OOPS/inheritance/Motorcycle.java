package assignment.OOPS.inheritance;

public class Motorcycle extends Vehicle{

    int numOfCylinders;

    public Motorcycle(String make, String model, double year, int numOfCylinders) {
        super(make, model, year);
        this.numOfCylinders = numOfCylinders;
    }

    @Override
    public void start() {
        System.out.println("Start mechanism of MotorBike");
    }

    @Override
    public void stop() {
        System.out.println("Stop mechanism of MotorBike");
    }

    @Override
    public void displayInfo() {
        System.out.println("Display information of MotorBike");
        System.out.println("Motorcycle make : " + make);
        System.out.println("Motorcycle model : " + model);
        System.out.println("Motorcycle year : " + year);
        System.out.println("Motorcycle Number of cylinder : " + numOfCylinders);
    }
}
