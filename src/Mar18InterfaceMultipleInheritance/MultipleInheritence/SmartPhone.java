package Mar18InterfaceMultipleInheritance.MultipleInheritence;

public interface SmartPhone extends Calculator,Camera,Clock,Telephone,MusicPlayer, InternetOperator {
    @Override
    void calculation();

    @Override
    void clickPicture();

    @Override
    void showTime();

    @Override
    void webBrowser();

    @Override
    void playSong();

    @Override
    void keypad();

    void smartPhoneType();
}
