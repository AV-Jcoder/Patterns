package Behavior.Strategy.Example_1;

public class BassSpeak implements SpeakBehavior{
    @Override
    public void speak() {
        System.out.println("Bass speaking");
    }
}
