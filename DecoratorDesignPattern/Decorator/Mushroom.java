package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza pizza) {
        System.out.println("Mushroom");
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 35;
    }
}