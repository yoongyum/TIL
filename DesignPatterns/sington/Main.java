package design.sigleton;

public class Main {
    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SoketClient aClient = aClazz.getSoketClient();
        SoketClient bClient = bClazz.getSoketClient();

        System.out.println("두객체가 동일한지 확인");
        System.out.println(aClient.equals(bClient));

    }
}
