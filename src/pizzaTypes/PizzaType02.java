package pizzaTypes;

import interfaces.IBuilder;
import builderdesignpattern.Pizza;

/**
 *
 * @author Ahmed El-Torky
 */
public class PizzaType02 implements IBuilder {

    private Pizza pizza02;

    public PizzaType02(Pizza pizza02) {
        this.pizza02 = pizza02;
    }

    @Override
    public void builder01() {
        pizza02.setS("S2");
    }

    @Override
    public void builder02() {
        pizza02.setT("T2");
    }

    @Override
    public void builder03() {
        pizza02.setD("D2");
    }

    @Override
    public void builder04() {
        pizza02.setF("F2");
    }

    @Override
    public Pizza getPizzaType() {
        builder01();
        builder02();
        builder03();
        builder04();
        return pizza02;
    }

}
