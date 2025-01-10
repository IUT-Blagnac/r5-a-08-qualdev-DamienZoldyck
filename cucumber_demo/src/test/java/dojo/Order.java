package dojo;

public class Order {
    private String from;
    private String to;
    private String message = "";

    public Order(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getTicketMessage() {
        if (message.isEmpty()) {
            return String.format("From %s to %s", from, to);
        }
        return String.format("From %s to %s: %s", from, to, message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }
}