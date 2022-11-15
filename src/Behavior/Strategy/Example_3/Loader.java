package Behavior.Strategy.Example_3;

public class Loader {
    public static void main(String[] args) {
        Person person = new Boxer();
        person.doSomething();
        person.setBeh(new Defend());
        person.doSomething();
    }
}
