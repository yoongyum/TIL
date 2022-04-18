package design.decorator;

public class A5 extends AudiDecorator{
    static final int MODEL_PRICE = 3000;

    public A5(ICar audi, String modelName) {
        super(audi, modelName, MODEL_PRICE);
    }
}
