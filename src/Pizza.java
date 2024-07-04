public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;



    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;
    }

    public void takeaway(){
        isOptedForTakeAway = true;
        System.out.println("Take away opted");
        this.price += backpackPrice;

    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " +basePizzaPrice);
        is(isExtraCheeseAdded){
            bill += "Extra Cheese Added: " +extraCheesePrice+ "\n";

        is(isExtraToppingsAdded){
            bill += "Extra Toppings Added: " +extraToppingsPrice+ "\n";

        is(isOptedForTakeAway){
            bill += "Take Away: " +backpackPrice+ "\n";

        }

    }
}


/**
 * Base Pizza: 300
 * Extra Cheese: 100
 * Extra Toppings: 150
 * Take Away: 20
 */