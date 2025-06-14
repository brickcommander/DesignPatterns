package DecoratorDesignPattern.Base;

public class VegDelight extends BasePizza {

    public VegDelight() {
        System.out.println("VegDelight");
    }

    @Override
    public int cost() {
        return 160;
    }
}
