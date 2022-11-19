package Strategy;

public class JumpBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Jump");
    }
}
