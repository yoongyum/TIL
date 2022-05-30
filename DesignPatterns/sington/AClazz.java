package design.sigleton;

public class AClazz {
    private SoketClient soketClient;

    public AClazz(){
        this.soketClient = SoketClient.getInstance();
    }

    public SoketClient getSoketClient(){
        return this.soketClient;
    }
}
