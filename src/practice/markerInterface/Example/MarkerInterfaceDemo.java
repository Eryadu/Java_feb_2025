package practice.markerInterface.Example;

interface VipAccess{

}

class VipGuest implements VipAccess{
    String name;

    public VipGuest(String name) {
        this.name = name;
    }
}

class Gate {
    public void gateEntry(Object obj){
        if(obj instanceof VipAccess){
            System.out.println("Access granted : " + obj.getClass().getSimpleName());
        }
        else {
            System.out.println("Access denied : " + obj.getClass().getSimpleName());
        }
    }
}
public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        VipGuest vipGuest = new VipGuest("Yad");
        String guest = "Gup";

        Gate entry = new Gate();
        entry.gateEntry(vipGuest);
        entry.gateEntry(guest);
    }
}
