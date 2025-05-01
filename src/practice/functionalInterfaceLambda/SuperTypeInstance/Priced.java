package practice.functionalInterfaceLambda.SuperTypeInstance;

public interface Priced {
     default double getPrice(){
         return 1.0;
     }

}
