package Strategy;

public class WalkBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Walk");
    }
}
