package practice;

import mar29.ImmutableClass;

import java.util.Date;

public final class ImmutableClass1 {
    private final String name;
    private final int ID;
    // Defensive copy for mutable objects
    private final Date birthDate;


    public ImmutableClass1(String name, int ID, Date birthDate) {
        this.name = name;
        this.ID = ID;
        // Defensive copy for mutable objects
        this.birthDate = new Date(birthDate.getTime());

    }
        public String getName() {
            return name;
        }

        public int getID() {
            return ID;
        }
    // Return defensive copy (not the original reference)
        public Date getBirthDate() {
            return new Date(birthDate.getTime());
        }

    @Override
    public String toString() {
        return "ImmutableClass1{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", birthDate=" + birthDate +
                '}';
    }

    public static void main(String[] args) {
        Date birthDate = new Date();
        ImmutableClass1 immutable =  new ImmutableClass1("Yad",12, birthDate);
        System.out.println(immutable.getName());
        System.out.println(immutable.getID());
        System.out.println(immutable.getBirthDate());
        System.out.println("Person : " + immutable);

        // Attempting to modify birthDate (should not affect the immutable object)
        birthDate.setTime(1990);
        System.out.println("After change : " + immutable);
    }
}
