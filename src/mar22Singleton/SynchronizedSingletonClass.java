package mar22Singleton;

public class SynchronizedSingletonClass {
    private static SynchronizedSingletonClass instance;

    private SynchronizedSingletonClass(){

    }

    public static synchronized SynchronizedSingletonClass getInstance(){
        if(instance==null)
        {
            instance = new SynchronizedSingletonClass();
        }
        return instance;
    }


    public static void main(String[] args)
    {
        SynchronizedSingletonClass s1 = SynchronizedSingletonClass.getInstance();
        SynchronizedSingletonClass s2 = SynchronizedSingletonClass.getInstance();
        SynchronizedSingletonClass s3 = SynchronizedSingletonClass.getInstance();
        System.out.println("Hashcode of s1 :" + s1.hashCode());
        System.out.println("Hashcode of s2 :" + s2.hashCode());
        System.out.println("Hashcode of s3 :" + s3.hashCode()); // Hashcode of s1 :1975012498
                                                                // Hashcode of s2 :1975012498
                                                                // Hashcode of s3 :1975012498
    }
}
