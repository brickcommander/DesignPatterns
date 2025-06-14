package DecoratorDesignPattern.Base;

public class FarmHouse extends BasePizza {

    public FarmHouse() {
        System.out.println("FarmHouse");
    }

    @Override
    public int cost() {
        return 200;
    }
}
