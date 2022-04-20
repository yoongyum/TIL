package design.sigleton;

public class SoketClient {
    private static SoketClient soketClient = null;

    private SoketClient() {

    }

    static SoketClient getInstance() {
        if (soketClient == null) {
            soketClient = new SoketClient();
        }
        return soketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
