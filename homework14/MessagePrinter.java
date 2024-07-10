package homework14;

public class MessagePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if (message.getSender() == null || message.getSender().isEmpty()) {
            if (message.getText() == null || message.getText().isEmpty()) {
                new Object() {
                    void handleEmptyMessage() {
                        System.out.println("Processing an empty message from an anonymous user...");
                    }
                }.handleEmptyMessage();
            } else {
                System.out.println("Anonymous user sent a message: " + message.getText());
            }
        } else {
            System.out.println("User " + message.getSender() + " sent a message: " + message.getText());
        }
    }

    public static void main(String[] args) {
        Printer printer = new MessagePrinter();


        Message message1 = new Message("Hello, world!", "John");
        Message message2 = new Message("This is a message from an anonymous user.", "");
        Message message3 = new Message("", null);

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
    }
}

