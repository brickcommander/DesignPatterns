package DecoratorDesignPattern;

import DecoratorDesignPattern.Base.BasePizza;
import DecoratorDesignPattern.Base.FarmHouse;
import DecoratorDesignPattern.Base.Margherita;
import DecoratorDesignPattern.Decorator.ExtraCheese;
import DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String args[]) {
        BasePizza customizedPizza1 = new Mushroom(new Margherita());
        System.out.println("Margherita with Mushroom : Rs " + customizedPizza1.cost());

        BasePizza customizedPizza2 = new ExtraCheese(new Mushroom(new FarmHouse()));
        System.out.println("FarmHouse with ExtraCheese and Mushroom: Rs " + customizedPizza2.cost());
    }
}
