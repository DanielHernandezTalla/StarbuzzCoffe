package starbuzzcoffeinterface;

public class __Soy extends CondimentDecorator{
    
    __Soy(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public double getCost() {
        return beverage.getCost() + 9.00;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    
}
