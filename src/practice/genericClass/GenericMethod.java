package practice.genericClass;

import java.util.Arrays;

public class GenericMethod {
    private String name;
    private String email;

    public GenericMethod(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "GenericMethod{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // generic Method
    <T>  void swap(T[] arr , int i, int j)
    {
        T temp = arr [i];
        arr [i] = arr [j];
        arr [j] = temp;
    }

    public static void main(String[] args) {
        GenericMethod genMet =  new GenericMethod("abc", "abc@gmail.com");
        System.out.println(genMet);
        Integer[] num = {1,2,3};
        genMet.swap(num, 0, 2);
        System.out.println("Swapped array : " + Arrays.toString(num));

        String[] str = {"abc", "cde"};
        genMet.swap(str, 0,1);
        System.out.println("Swapped String : " + Arrays.toString(str));
    }
}
