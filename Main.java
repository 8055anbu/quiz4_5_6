package quiz4_5_6;

public class Main {
    public static void main(String[] args) {
        CommunicationManager commManager = new DummyCommunicationManager();
        UserInteractionManager uiManager = new UserInteractionManager(commManager);
        uiManager.startChat();
    }
}