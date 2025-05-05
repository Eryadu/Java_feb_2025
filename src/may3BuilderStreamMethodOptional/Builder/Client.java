package may3BuilderStreamMethodOptional.Builder;

public class Client {
    public  static  void main (String ... args){
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();
        director.construct(gamingComputerBuilder);
        Computer gamingComputer = gamingComputerBuilder.getResult();
        gamingComputer.displayInfo();
    }
}
