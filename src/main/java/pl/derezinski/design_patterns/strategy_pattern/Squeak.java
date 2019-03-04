package pl.derezinski.design_patterns.strategy_pattern;

public class Squeak implements QuackBehaviour {

    public void quack() {
        System.out.println("Squeak");
    }
}
