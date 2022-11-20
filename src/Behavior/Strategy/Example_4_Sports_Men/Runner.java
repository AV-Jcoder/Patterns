package Behavior.Strategy.Example_4_Sports_Men;

public class Runner extends SportsMan {
    public Runner() {
        super(new RunBehavior());
    }
}
