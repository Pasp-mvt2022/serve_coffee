package coffee;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {
    CoffeeMachine coffeeMachine;

    @Before
    public void setUp() {
        coffeeMachine = new CoffeeMachine();
    }

    @After
    public void tearDown() {

    }

    @Given("There is {int} cups of coffee left")
    public void thereIsNumberCupsOfCoffeeLeft(int number) {
        coffeeMachine.setCupsLeft(number);
    }

    @And("I have paid {int}")
    public void iHavePaidMoney(int money) {
        coffeeMachine.pay(money);
    }

    @Then("I will be served {int} coffee")
    public void iWillBeServedAmountCoffee(int expected) {
        assertEquals(expected, coffeeMachine.serveCoffee());
    }

    @And("I will get {int} money back")
    public void iWillGetAmountMoneyMoneyBack(int expected) {
        assertEquals(expected, coffeeMachine.getRefundedMoney());
    }

    @And("I make {int} cups of coffee")
    public void iMakeMakeNumberCupsOfCoffee(int makeNumber) {
        coffeeMachine.makeCoffee(makeNumber);
    }

    @Then("The coffee machine have {int} cups of coffee")
    public void theCoffeeMachineHaveAmountCupsOfCoffee(int amount) {
        assertEquals(amount, coffeeMachine.getCupsLeft());
    }

    @Given("I have chosen what {string} of coffee I want")
    public void iHaveChosenWhatOfCoffeeIWant(String type) {
        coffeeMachine.selectType(type);
    }

    @When("I {string} the button")
    public void iTheButton(String pressed) {
        
    }
}
