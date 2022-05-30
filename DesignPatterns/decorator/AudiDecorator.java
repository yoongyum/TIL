package design.decorator;

public class AudiDecorator implements ICar{
    protected ICar audi;
    protected String modelName;
    protected int modePrice;

    public AudiDecorator(ICar audi, String modelName, int modePrice){
        this.audi = audi;
        this.modelName = modelName;
        this.modePrice = modePrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modePrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName+"의 가격은 "+ getPrice() +" 원 입니다.");
    }
}
