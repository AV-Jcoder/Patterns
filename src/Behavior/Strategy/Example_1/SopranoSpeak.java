package Behavior.Strategy.Example_1;

public class SopranoSpeak implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.println("Soprano speaking");
    }
}
