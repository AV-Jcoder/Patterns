package Strategy;

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
