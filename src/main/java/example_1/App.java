package example_1;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg){
        String message = msg.replaceAll(
                client.getId(), client.getFullname()
        );
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
//        App app = new App();

//        app.client = new Client("1", "John Smith");
//        app.eventLogger = new ConsoleEventLogger();
//
//        app.logEvent("Some event for user 1");
    }


}
