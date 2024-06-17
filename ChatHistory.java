package quiz4_5_6;

import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    private List<Message> chatHistory = new ArrayList<>();

    public void addMessage(String sender, String message) {
        chatHistory.add(new Message(sender, message));
    }

    public List<Message> getChatHistory() {
        return chatHistory;
    }
}