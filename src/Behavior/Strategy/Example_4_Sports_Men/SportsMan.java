package Behavior.Strategy.Example_4_Sports_Men;

public abstract class SportsMan {
    private MoveBehavior behavior;

    SportsMan(MoveBehavior behavior) {
        this.behavior = behavior;
    }

    public void doMove() {
        behavior.move();
    }

    public void setMoveBehavior(MoveBehavior behavior) {
        this.behavior = behavior;
    }
}
