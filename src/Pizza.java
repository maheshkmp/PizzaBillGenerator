public class Pizza {
    private int prize;
    private boolean veg;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.prize = 300;
        } else {
            this.prize = 400;
        }
    }


    public void getPizzaPrice() {

        System.out.println(this.prize);
    }
}