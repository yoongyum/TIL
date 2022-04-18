package design.decorator;

public class A3 extends AudiDecorator{
    static final int MODEL_PRICE = 1000;

    public A3(ICar audi, String modelName) {
        super(audi, modelName, MODEL_PRICE);
    }
}
