package builderdesignpattern;

import interfaces.IBuilder;
import pizzaTypes.PizzaType01;
import pizzaTypes.PizzaType02;

/**
 *
 * @author Ahmed El-Torky
 */
public class BuilderDesignPattern {

    public static void main(String[] args) {
        
        Waiter waiter = new Waiter(new PizzaType01(new Pizza()));
        Pizza finalPizza;
        finalPizza = waiter.getOrderPizza();
        System.out.println("type one pizza:");
        finalPizza.eatPizza();
        
        IBuilder pizza02 = new PizzaType02(new Pizza());
        waiter = new Waiter(pizza02);
        finalPizza = waiter.getOrderPizza();
        System.out.println("type two pizza:");
        finalPizza.eatPizza();

    }
}
