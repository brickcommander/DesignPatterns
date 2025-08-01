package DecoratorDesignPattern.Base;

public class Margherita extends BasePizza {
    public Margherita() {
        System.out.println("Margherita");
    }
    @Override
    public int cost() {
        return 120;
    }
}
