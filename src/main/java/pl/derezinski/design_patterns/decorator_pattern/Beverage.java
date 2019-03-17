package pl.derezinski.design_patterns.decorator_pattern;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
