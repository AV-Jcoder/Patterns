package Behavior.Strategy.Example_4_Sports_Men;

public class Jumper extends SportsMan {
    public Jumper() {
        super(new JumpBehavior());
    }
}
