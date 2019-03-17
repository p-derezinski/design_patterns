package pl.derezinski.design_patterns.decorator_pattern;

public class Brazil extends Beverage {

    public Brazil() {
        description = "Brazilian Coffee";
    }

    @Override
    public double cost() {
        return 1.59;
    }
}
