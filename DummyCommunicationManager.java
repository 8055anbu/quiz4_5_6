package quiz4_5_6;

import java.util.List;

public class DummyCommunicationManager implements CommunicationManager {
    @Override
    public String sendMessage(String userMessage, List<Message> chatHistory) {
        // Dummy response logic for testing
        if (userMessage.equalsIgnoreCase("Hello")) {
            return "Good day";
        } else if (userMessage.equalsIgnoreCase("What time is it?")) {
            return "9:00 AM";
        } else if (userMessage.equalsIgnoreCase("I should go!")) {
            return "Wait for me!";
        }
        return "I don't understand";
    }
}