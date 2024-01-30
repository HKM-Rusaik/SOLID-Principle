package dependencyinversion;

// High-level module that depends on abstractions, not on specific implementations
class NotificationService implements MessageSender {
    @Override
    public void sendMessage(Message message) {
        // Simulate sending a message
        System.out.println("Sending message: " + message.getContent());
    }
}
