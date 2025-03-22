package feb15_IFElse;

public class VowelConsonant {
    public static void main(String[] args) {

        char ch = 'a';
        if( ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'  ){
            System.out.println("This is Vowel");
        }
        else
            System.out.println("This is Consonent");
    }
}
