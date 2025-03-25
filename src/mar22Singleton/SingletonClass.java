package mar22Singleton;

public class SingletonClass {
    private SingletonClass() {
    }

    private static SingletonClass var ;
   public static final SingletonClass getVar(){
       if(var==null)
       {
           var =  new SingletonClass();
       }
       return getVar();
   }
}
