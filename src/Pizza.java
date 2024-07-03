public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpackPrice = 20;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;
    }

    public void takeaway(){
        System.out.println("Take away opted");
        this.price += backpackPrice;

    }

    public void getBill(){
        System.out.println(this.price);

    }
}
