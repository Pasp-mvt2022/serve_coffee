package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    private int moneyPaid;
    private int moneyBack;
    private List<Coffee> coffees;
    private Coffee activeCoffee;

    public CoffeeMachine() {
        coffees = new ArrayList<>();
        coffees.add(new Coffee("Black", 10));
        coffees.add(new Coffee("Cappucino", 20));
        coffees.add(new Coffee("Espresso", 15));
        for (Coffee c : coffees) {
            c.makeCoffee(10);
        }
        activeCoffee = coffees.get(0);
    }

    public void pay(int money) {
        this.moneyPaid = money;
    }

    public int serveCoffee() {
        int cupsPaidFor = moneyPaid/activeCoffee.getPrice();
        this.moneyBack = moneyPaid%activeCoffee.getPrice();
        int cupsToServe = 0;
        if (getCupsLeft() > 0 && getCupsLeft() >= cupsPaidFor) {
            cupsToServe = cupsPaidFor;
            activeCoffee.serveCoffee(cupsToServe);
        } else if (getCupsLeft() > 0) {
            cupsToServe = getCupsLeft();
            activeCoffee.serveCoffee(getCupsLeft());
            this.moneyBack += (cupsPaidFor - cupsToServe) * 10;
        }
        return cupsToServe;
    }

    public int getRefundedMoney() {
        return moneyBack;
    }

    public void makeCoffee(int makeNumber) {
        activeCoffee.makeCoffee(makeNumber);
    }

    public int getCupsLeft() {
        return activeCoffee.getCupsLeft();
    }

    public void selectType(String type) {
        for (Coffee c : coffees) {
            if (c.getType().equals(type)) {
                activeCoffee = c;
            }
        }
    }

    public void setCupsLeft(int number) {
        coffees.get(0).serveCoffee(getCupsLeft());
        coffees.get(0).makeCoffee(number);
    }
}
