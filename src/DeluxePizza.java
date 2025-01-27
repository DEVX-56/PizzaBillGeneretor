public class DeluxePizza extends Pizza{
    public DeluxePizza(Boolean veg) {
        super(veg);
        // in deluxe pizza all extra item will be added by default
        super.addExtraCheese();
        super.addExtraToppings();
        super.totalBill();
    }

    // we have disabled this option for deluxe users
    @Override
    public void addExtraToppings() {}

    @Override
    public void addExtraCheese() {}
}
