package starbuzzcoffeinterface;

public class __Milk extends CondimentDecorator{

    __Milk(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public double getCost() {
        return beverage.getCost() + 3.00;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
