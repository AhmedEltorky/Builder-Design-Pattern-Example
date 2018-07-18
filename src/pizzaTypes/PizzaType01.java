package pizzaTypes;

import interfaces.IBuilder;
import builderdesignpattern.Pizza;

/**
 *
 * @author Ahmed El-Torky
 */
public class PizzaType01 implements IBuilder {

    private Pizza pizza01;

    public PizzaType01(Pizza pizza01) {
        this.pizza01 = pizza01;
    }

    @Override
    public void builder01() {
        pizza01.setS("S1");
    }

    @Override
    public void builder02() {
        pizza01.setT("T1");
    }

    @Override
    public void builder03() {
        pizza01.setD("D1");
    }

    @Override
    public void builder04() {
        pizza01.setF("F1");
    }

    @Override
    public Pizza getPizzaType() {
        builder01();
        builder02();
        builder03();
        builder04();
        return pizza01;
    }

}
