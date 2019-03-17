package pl.derezinski.design_patterns.decorator_pattern;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

}
