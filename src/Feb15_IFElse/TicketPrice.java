package Feb15_IFElse;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to check price of Ticket : ");
        String day = scanner.nextLine();
       if (day.equals("Monday") || day.equals("monday") || day.equals("Tuesday") || day.equals("tuesday") || day.equals("Wednesday")
         || day.equals("wednesday") || day.equals("Thursday") || day.equals("thursday") || day.equals("Friday") || day.equals("friday")) {
           System.out.println("Ticket price for " + day + " is : $10");
       } else if (day.equals("Saturday") || day.equals("saturday") ) {
            System.out.println("Ticket price is : $15");
       } else if (day.equals("Sunday") || day.equals("sunday") ) {
            System.out.println("Ticket price is : $12");
       } else
           System.out.println("Invalid Entry");
    }
}
