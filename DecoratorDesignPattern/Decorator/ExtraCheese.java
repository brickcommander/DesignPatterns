package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza) {
        System.out.println("ExtraCheese");
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 25;
    }
}