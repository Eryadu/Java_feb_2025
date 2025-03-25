package mar22Singleton;
// Early Initialization in Singleton Class

public class EarlyInitialSingleton {

    private static final EarlyInitialSingleton instance = new EarlyInitialSingleton();

    private EarlyInitialSingleton(){

    }
    public static EarlyInitialSingleton getInstance()
    {
        return instance;
    }


public static void main(String[] args){
    EarlyInitialSingleton s1 = EarlyInitialSingleton.getInstance();
    EarlyInitialSingleton s2 = EarlyInitialSingleton.getInstance();
    if(s1==s2){
        System.out.println("Hashcode of s1 : " + s1.hashCode());
        System.out.println("Hashcode of s2 : " + s2.hashCode());
    }

}
}