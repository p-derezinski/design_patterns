package pl.derezinski.design_patterns.strategy_pattern;

public class FlyWithWings implements FlyBehaviour {

    public void fly() {
        System.out.println("I'm flying!");
    }
}
