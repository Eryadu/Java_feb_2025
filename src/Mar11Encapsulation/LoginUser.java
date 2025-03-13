package Mar11Encapsulation;

public class LoginUser {
    private String userName;
    private String passWord;

    public LoginUser(String username, String passWord) {
        this.userName = username;
        this.passWord = passWord;
    }

    public String getUsername() {
        return userName;
    }

    /*public void setUsername(String username) {
        this.userName = username;
    }*/  // you can't set username, you can only get old username by get method

    /*public String getPassWord() {
        return passWord;
    }
*/ // you can just set password not get the old one.

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void isValidUser(String userName , String passWord)
    {
        if(this.userName.equalsIgnoreCase(userName) && this.passWord.equalsIgnoreCase(passWord))
        {
            System.out.println("Valid user .... ");
        }
        else {
            System.out.println("Invalid user... Try Again.");
        }
    }
}
