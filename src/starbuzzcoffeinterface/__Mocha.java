package starbuzzcoffeinterface;

public class __Mocha extends CondimentDecorator{
    
    __Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public double getCost() {
        return beverage.getCost() + 6.00;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
}
