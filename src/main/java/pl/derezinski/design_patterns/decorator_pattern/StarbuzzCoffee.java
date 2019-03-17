package pl.derezinski.design_patterns.decorator_pattern;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage_1 = new Espresso();
        System.out.println(beverage_1.getDescription() + " $" + beverage_1.cost());

        Beverage beverage_2 = new DarkRoast();
        beverage_2 = new Mocha(beverage_2);
        beverage_2 = new Mocha(beverage_2);
        beverage_2 = new Whip(beverage_2);
        System.out.println(beverage_2.getDescription() + " $" + beverage_2.cost());

        Beverage beverage_3 = new HouseBlend();
        beverage_3 = new Soy(beverage_3);
        beverage_3 = new Mocha(beverage_3);
        beverage_3 = new Whip(beverage_3);
        System.out.println(beverage_3.getDescription() + " $" + beverage_3.cost());

    }

}
