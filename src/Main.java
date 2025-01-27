
public class Main {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.totalBill();

//        DeluxePizza dpi = new DeluxePizza(true);
//        dpi.totalBill();

        DeluxePizza dp = new DeluxePizza(false);
        //dp.addExtraCheese(); //we can't add this
        dp.totalBill();
    }
}