package pl.derezinski.design_patterns.strategy_pattern;

public class FlyNoWay implements FlyBehaviour {

    public void fly() {
        System.out.println("I can't fly");
    }
}
