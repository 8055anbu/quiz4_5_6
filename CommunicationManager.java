package quiz4_5_6;

import java.util.List;

public interface CommunicationManager {
    String sendMessage(String userMessage, List<Message> chatHistory);
}