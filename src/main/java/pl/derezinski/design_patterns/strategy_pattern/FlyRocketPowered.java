package pl.derezinski.design_patterns.strategy_pattern;

public class FlyRocketPowered implements FlyBehaviour {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
