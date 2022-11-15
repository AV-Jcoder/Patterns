package Behavior.Strategy.Example_3;

public class Attack implements Behavior{
    @Override
    public void doSome() {
        System.out.println("Attack!");
    }
}
