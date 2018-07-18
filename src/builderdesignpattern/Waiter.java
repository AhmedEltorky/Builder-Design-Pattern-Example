package builderdesignpattern;

import interfaces.IBuilder;

/**
 *
 * @author Ahmed El-Torky
 */
public class Waiter {

    private Pizza orderPizza;

    public Waiter(IBuilder type) {
        orderPizza = type.getPizzaType();
    }

    public Pizza getOrderPizza() {
        return orderPizza;
    }

    public void setOrderPizza(Pizza orderPizza) {
        this.orderPizza = orderPizza;
    }

}
