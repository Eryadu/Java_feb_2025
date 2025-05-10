package practice;

public class PalindromeSingleLine {
    public static void main(String[] args) {
        String str = "EEleE";
        boolean isPalindrome = str.equalsIgnoreCase (new StringBuilder(str).reverse().toString());
        System.out.println(isPalindrome);
    }
}
