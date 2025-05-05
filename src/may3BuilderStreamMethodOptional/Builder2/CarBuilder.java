package may3BuilderStreamMethodOptional.Builder2;

public class CarBuilder implements Builder2{
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildSeat() {
        car.setSeats(2);
    }

    @Override
    public void buildEngine() {
        car.setEngine(00);
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer(100);
    }

    @Override
    public void buildGPS() {
        car.setgPS(100);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
