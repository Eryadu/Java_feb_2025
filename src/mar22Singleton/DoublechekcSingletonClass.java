package mar22Singleton;

public class DoublechekcSingletonClass {
    private static DoublechekcSingletonClass instance;

    private DoublechekcSingletonClass(){

    }

    public static synchronized DoublechekcSingletonClass getInstance(){
        if(instance==null)
        {
            synchronized (DoublechekcSingletonClass.class){
                if(instance==null){
                    instance = new DoublechekcSingletonClass();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args)
    {
        DoublechekcSingletonClass s1 = DoublechekcSingletonClass.getInstance();
        DoublechekcSingletonClass s2 = DoublechekcSingletonClass.getInstance();
        DoublechekcSingletonClass s3 = DoublechekcSingletonClass.getInstance();

        System.out.println("Hashcode of s1 :" + s1.hashCode());
        System.out.println("Hashcode of s2 :" + s2.hashCode());
        System.out.println("Hashcode of s3 :" + s3.hashCode()); // Hashcode of s1 :1975012498
                                                                // Hashcode of s2 :1975012498
                                                                // Hashcode of s3 :1975012498
    }
}
