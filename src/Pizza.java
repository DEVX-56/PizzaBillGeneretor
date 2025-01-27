public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice = 300;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;


    //constructor
    public Pizza(Boolean veg) {
        this.veg = veg;
        //for vegpizza
        if(this.veg){
            this.price = 300;
        }// for non-veg pizza
        else{
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }

    //Method for extra-cheese
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        //System.out.println("You have added extra Cheese");
        this.price += extraCheesePrice;
    }

    //Method for extra-Toppings
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        //System.out.println("You have added extra Toppings");
        this.price += extraToppingsPrice;
    }

    //Method for take-away
    public void takeAway(){
        isOptedForTakeAway = true;
        //System.out.println("Take away opted");
        this.price += backPackPrice;
    }

    //Method for total BIll
    public void totalBill(){
        String bill = "";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added: "+extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill += "Take away: "+backPackPrice+"\n";
        }
        bill += "Total Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
