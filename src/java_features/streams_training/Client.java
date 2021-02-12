package java_features.streams_training;

public class Client {
    private Message message;

    public Client() {
        this.message = new Telegram();
    }

    public Client(int n) {
        this.message = new Viber();
    }

    public void go() {
        message.message();
        message.method();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.go();

        Client client1 = new Client(24);
        client1.go();
    }
}
