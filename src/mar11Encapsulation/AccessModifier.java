package mar11Encapsulation;

public class AccessModifier {
    protected String name;
    private String value = "123";

    public String getValue() { // this getter and setter is for private
        System.out.println(value);
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        System.out.println(value);
    }

    protected void showDisplay(){
        System.out.println("This is show method of AccessModifier Class");
        System.out.println(name);


    }
}

class Access1 extends AccessModifier{
    public void setName(String name){ // this setter methode to access the protected variable
        this.name = name;
        System.out.println(this.name);
    }


    public void showDisplay(){
        System.out.println("This is show display methode of Access1 class.");
            super.showDisplay();
        }

    }

   class Access2 extends AccessModifier{
       public static void main(String[] args) {
           Access2 access2 = new Access2();
           access2.name ="ABC";
           access2.showDisplay();
           Access1 access1 = new Access1();
           access1.setName("CDE");
           access1.showDisplay();
           access1.setValue("32222");
           access2.getValue();
       }
   }