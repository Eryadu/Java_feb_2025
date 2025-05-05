package may3BuilderStreamMethodOptional.Builder;


/*Problem Statement:

You are tasked with implementing a system for building custom computers.
Each computer can have different configurations based on user preferences.
The goal is to provide flexibility in creating computers with varying CPUs, RAM, and storage options.*/

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

   public void setCpu(String cpu){
       this.cpu = cpu;
   }
   public void setRam(String ram){
       this.ram = ram;
   }
   public void setStorage(String storage){
       this.storage = storage;
   }

   public void displayInfo(){
       System.out.println("Computer Configuration");
       System.out.println("CPU :" + cpu);
       System.out.println("RAM : " + ram);
       System.out.println("STORAGE : " + storage);
   }
}
