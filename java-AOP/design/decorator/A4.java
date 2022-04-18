package design.decorator;

public class A4 extends AudiDecorator{
    static final int MODEL_PRICE = 2000;

    public A4(ICar audi, String modelName) {
        super(audi, modelName, MODEL_PRICE);
    }
}
