package mar22Singleton;
// Lazy Instatiate of Singleton class (Create object when needed)
public class LazySingletonClass {

    String str;
    private LazySingletonClass() {// prevent it from external instatiation
        str = "You are in LazySingleton Class";
    }

    private static LazySingletonClass instance;

   public static LazySingletonClass getInstance(){
       if(instance==null)
       {
           instance =  new LazySingletonClass();
       }
       return instance;
   }

   public void getDisplay(){
       System.out.println("Welcome to SingletonClass");
   }


   public static void main(String[]args){
       LazySingletonClass s1 = LazySingletonClass.getInstance();
       LazySingletonClass s2 = LazySingletonClass.getInstance();
       LazySingletonClass s3 = LazySingletonClass.getInstance();
       LazySingletonClass s4 = LazySingletonClass.getInstance();
       System.out.println("Hashcode of s1 : " + s1.hashCode());
       System.out.println("Hashcode of s2 : " + s2.hashCode());
       System.out.println("Hashcode of s3 : " + s3.hashCode());
       System.out.println("Hashcode of s4 : " + s4.hashCode());
       System.out.println();
       System.out.println();

       s1.getDisplay(); // access the method of singleton class
       s1.str = s1.str.toLowerCase(); // access the variable of singleton class
       System.out.println(s1.str); // if change by one object then refect same in others
       System.out.println(s2.str);
       System.out.println(s3.str);
       System.out.println(s4.str);
       System.out.println();
       System.out.println();

       s2.str = s2.str.toUpperCase();
       System.out.println(s1.str);
       System.out.println(s2.str);
       System.out.println(s3.str);
       System.out.println(s4.str);

       /*Hashcode of s1 : 1975012498
       Hashcode of s2 : 1975012498
       Hashcode of s3 : 1975012498
       Hashcode of s4 : 1975012498


       Welcome to SingletonClass
       you are in lazysingleton class
       you are in lazysingleton class
       you are in lazysingleton class
       you are in lazysingleton class


       YOU ARE IN LAZYSINGLETON CLASS
       YOU ARE IN LAZYSINGLETON CLASS
       YOU ARE IN LAZYSINGLETON CLASS
       YOU ARE IN LAZYSINGLETON CLASS*/
   }
}
