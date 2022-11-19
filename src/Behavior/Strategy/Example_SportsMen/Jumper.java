package Strategy;

public class Jumper extends SportsMan {
    public Jumper() {
        super(new JumpBehavior());
    }
}
