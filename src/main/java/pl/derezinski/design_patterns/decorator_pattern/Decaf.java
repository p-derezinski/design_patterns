package pl.derezinski.design_patterns.decorator_pattern;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

