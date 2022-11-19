package Strategy;

public class Runner extends SportsMan {
    public Runner() {
        super(new RunBehavior());
    }
}
