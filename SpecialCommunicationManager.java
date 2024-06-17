package quiz4_5_6;

import java.util.List;

public class SpecialCommunicationManager extends DummyCommunicationManager {
    private String commonServiceUrl;
    private String specialServiceUrl;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
    }

    @Override
    public String sendMessage(String userMessage, List<Message> chatHistory) {
        String serviceUrl = commonServiceUrl;

        for (Message message : chatHistory) {
            if (message.message.toLowerCase().contains("help")) {
                serviceUrl = specialServiceUrl;
                break;
            }
        }

        // Simulate communication with appropriate service URL
        // For now, we use dummy logic to simulate response
        System.out.println("Sending to: " + serviceUrl);

        return super.sendMessage(userMessage, chatHistory);
    }

    public static void main(String[] args) {
        CommunicationManager commManager = new SpecialCommunicationManager("http://common.service.url", "http://special.service.url");
        UsrerInteractionManager uiManager = new UsrerInteractionManager(commManager);
        uiManager.startChat();
    }
}