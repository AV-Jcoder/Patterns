package Behavior.Strategy.Example_4_Sports_Men;

public class RunBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Run");
    }
}
