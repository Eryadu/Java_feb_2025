package may3BuilderStreamMethodOptional.Builder2;

public class Car {
    private int seats;
    private int engine;
    private int tripComputer;
    private int gPS;

    public void setSeats(int seats){
        this.seats=seats;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setTripComputer(int tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setgPS(int gPS) {
        this.gPS = gPS;
    }

    public void displayInfo(){
        System.out.println("Car Info : ");
        System.out.println("Car Seats : " + seats);
        System.out.println("Car Engine : " + engine);
        System.out.println("Car TripComputer Value : " + tripComputer);
        System.out.println("Car GPS : " + gPS);
    }
}
