package Strategy;

public class WalkMan extends SportsMan {
    public WalkMan() {
        super(new WalkBehavior());
    }
}
