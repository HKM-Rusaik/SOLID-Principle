package dependencyinversion;

// Client code using the high-level module without knowing the low-level details
public class MessagingClient {
    public static void main(String[] args) {
        Message emailMessage = new Email("Hello, this is an email!");
        Message smsMessage = new SMS("Hi, this is a SMS!");

        MessageSender notificationService = new NotificationService();

        // The high-level module depends on abstractions
        notificationService.sendMessage(emailMessage);
        notificationService.sendMessage(smsMessage);
    }
}
