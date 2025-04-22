package assignment.OOPS.inheritance;

public class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(String make, String model, double year, int numberOfDoor, int batteryCapacity) {
        super(make, model, year, numberOfDoor);
        this.batteryCapacity = batteryCapacity;
    }

    void chargeBattery(){
        System.out.println("Display Battery Capacity");
        System.out.println("Electrical car battery capacity : " + batteryCapacity);
    }


    @Override
    void carType() {
        System.out.println("Display Electrical car Type");
        System.out.println("Electrical car model : " + model);
        System.out.println("Electrical car year : " + year);
        System.out.println("Electrical car Number of Door : " + numberOfDoor);

    }
}
