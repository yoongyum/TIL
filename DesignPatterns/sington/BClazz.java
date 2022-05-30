package design.sigleton;

public class BClazz {
    private SoketClient soketClient;

    public BClazz(){
        this.soketClient = SoketClient.getInstance();
    }

    public SoketClient getSoketClient(){
        return this.soketClient;
    }
}
