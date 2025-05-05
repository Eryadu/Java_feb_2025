package may3BuilderStreamMethodOptional.Builder2;

public class Client2 {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarDirector director = new CarDirector();
        director.Construct(carBuilder);
        Car car = carBuilder.getResult();
        car.displayInfo();

        CarManual carManual = new CarManual();
        director.Construct(carManual);
        Car car1 = carManual.getResult();
        car1.displayInfo();
    }
}
