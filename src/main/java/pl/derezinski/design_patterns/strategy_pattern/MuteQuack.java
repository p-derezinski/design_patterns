package pl.derezinski.design_patterns.strategy_pattern;

public class MuteQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
