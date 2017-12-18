package example_1;

import example_1.interfaces.EventLogger;

public class ConsoleEventLogger implements EventLogger{

    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
