package mar18InterfaceMultipleInheritance.MultipleInheritence;

public class MainClass {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new Samsung();
        SmartPhone smartPhone2 = new Iphone15();
        SmartPhone smartPhone3 = new Iphone16();
        System.out.println("Samsung Smart phone");
        smartPhone1.smartPhoneType();
        smartPhone1.calculation();
        smartPhone1.clickPicture();
        smartPhone1.keypad();
        smartPhone1.playSong();
        smartPhone1.showTime();
        smartPhone1.webBrowser();
        System.out.println();
        System.out.println();

        System.out.println("Iphone15 Smart phone");
        smartPhone2.smartPhoneType();
        smartPhone2.calculation();
        smartPhone2.clickPicture();
        smartPhone2.keypad();
        smartPhone2.playSong();
        smartPhone2.showTime();
        smartPhone2.webBrowser();
        System.out.println();
        System.out.println();

        System.out.println("Iphone16 Smart phone");
        smartPhone3.smartPhoneType();
        smartPhone3.calculation();
        smartPhone3.clickPicture();
        smartPhone3.keypad();
        smartPhone3.playSong();
        smartPhone3.showTime();
        smartPhone3.webBrowser();

    }
}
