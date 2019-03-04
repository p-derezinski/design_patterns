package pl.derezinski.design_patterns.strategy_pattern;

public class Quack implements QuackBehaviour {

    public void quack() {
        System.out.println("Quack");
    }
}
