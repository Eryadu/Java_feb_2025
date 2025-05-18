package mar22Singleton;

public class VolatileSingletonClass {
    private static volatile VolatileSingletonClass instance; // volatile keyword

    private VolatileSingletonClass(){

    }

    public static VolatileSingletonClass getInstance()
    {
        if (instance== null)
       {
         synchronized (VolatileSingletonClass.class)
         {
             if (instance==null)
             {
            instance = new VolatileSingletonClass();
             }
         }
    }
        return instance;
    }

    public static void main(String[] args) {
        VolatileSingletonClass v1 = VolatileSingletonClass.getInstance();
        VolatileSingletonClass v2 = VolatileSingletonClass.getInstance();
        System.out.println("Hashcode of v1 : " + v1.hashCode());
        System.out.println("Hashcode of v2 : " + v2.hashCode()); // Hashcode of v1 : 1975012498
                                                                 // Hashcode of v2 : 1975012498
    }
    }
