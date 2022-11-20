package Behavior.Strategy.Example_4_Sports_Men;

public class WalkMan extends SportsMan {
    public WalkMan() {
        super(new WalkBehavior());
    }
}
