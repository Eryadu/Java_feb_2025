package mar18InterfaceMultipleInheritance.MultipleInheritence;

public class Samsung implements SmartPhone{
    @Override
    public void calculation() {
        System.out.println("Samsung has simple calculator.");
    }

    @Override
    public void clickPicture() {
        System.out.println("Samsung camera are 12mp.");
    }

    @Override
    public void showTime() {
        System.out.println("Samsung show time Digitally.");
    }

    @Override
    public void webBrowser() {
        System.out.println("Samsung has Crome WebBrowser.");
    }

    @Override
    public void playSong() {
        System.out.println("Samsung has Mp3 music player.");
    }

    @Override
    public void keypad() {
        System.out.println("Samsung has Querty keypad.");
    }

    @Override
    public void smartPhoneType() {
        System.out.println("Sansung is basic features smartphone.");
    }
}
