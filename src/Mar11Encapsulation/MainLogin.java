package Mar11Encapsulation;

public class MainLogin {
    public static void main(String[] args) {
        LoginUser loginUser = new LoginUser("user" , "12345");


        System.out.println(loginUser.getUsername()); // in case you forget username you can get it by getter.
        //System.out.println(loginUser.getPassWord()); // but you can not get old password. you have to set new password
        loginUser.setPassWord("Password@123");
        loginUser.isValidUser("user" , "12345");
        System.out.println();
        System.out.println("After changing the old password...");
        loginUser.isValidUser("user" , "Password@123");


    }
}
