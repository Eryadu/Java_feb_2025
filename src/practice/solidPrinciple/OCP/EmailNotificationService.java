package practice.solidPrinciple.OCP;

public class EmailNotificationService implements Notificationservice {
    @Override
    public void sendOTP(String medium) {
        // write login to integrate with email api
    }

    @Override
    public void sendTransactionReport(String medium) {

    }
}
