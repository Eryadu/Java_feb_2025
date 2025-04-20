package practice.solidPrinciple.OCP;

public class WhatsappNotificationService implements Notificationservice{
    @Override
    public void sendOTP(String medium) {
        // logic to integrate whatsapp api
    }

    @Override
    public void sendTransactionReport(String medium) {

    }
}
