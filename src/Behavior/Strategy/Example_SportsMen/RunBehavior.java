package Strategy;

public class RunBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Run");
    }
}
