//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true );
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.takeaway();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.takeaway();
        dp.getBill();
    }



}