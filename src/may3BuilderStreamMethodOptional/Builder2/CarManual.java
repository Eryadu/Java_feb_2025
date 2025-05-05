package may3BuilderStreamMethodOptional.Builder2;

public class CarManual implements Builder2{
    private Car car;

    public CarManual() {
        this.car = new Car();
    }

    @Override
    public void buildSeat() {
        car.setSeats(2);
    }

    @Override
    public void buildEngine() {
        car.setEngine(100);
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer(1000);
    }

    @Override
    public void buildGPS() {
            car.setgPS(120);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
