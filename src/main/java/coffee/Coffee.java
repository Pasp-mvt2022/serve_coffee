package coffee;

public class Coffee {
    private String type;
    private int cupsLeft;
    private final int price;

    public Coffee(String type, int price) {
        this.type = type;
        this.price = price;
        this.cupsLeft = 0;
    }

    public int getCupsLeft() {
        return cupsLeft;
    }

    public void makeCoffee(int numberCups) {
        this.cupsLeft += numberCups;
    }

    public void serveCoffee(int numberCups) {
        this.cupsLeft -= numberCups;
    }

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }
}
