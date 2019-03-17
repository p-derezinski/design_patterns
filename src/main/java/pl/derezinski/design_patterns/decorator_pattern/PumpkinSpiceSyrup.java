package pl.derezinski.design_patterns.decorator_pattern;

public class PumpkinSpiceSyrup extends CondimentDecorator {

    public PumpkinSpiceSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Pumpkin Spice Syrup";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .25;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .35;
        }
        return cost;
    }
}
