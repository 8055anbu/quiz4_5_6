package quiz4_5_6;

import java.util.Scanner;

public class UserInteractionManager {
    private ChatHistory chatHistory = new ChatHistory();
    private CommunicationManager commManager;

    public UserInteractionManager(CommunicationManager commManager) {
        this.commManager = commManager;
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("User: ");
            String userMessage = scanner.nextLine();
            chatHistory.addMessage("User", userMessage);
            
            String response = commManager.sendMessage(userMessage, chatHistory.getChatHistory());
            System.out.println("Chatbot: " + response);
            chatHistory.addMessage("Chatbot", response);
        }
    }
}