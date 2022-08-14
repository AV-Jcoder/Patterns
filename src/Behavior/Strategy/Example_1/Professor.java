package Behavior.Strategy.Example_1;

public class Professor extends Worker {
    Professor () {
        this.speakBehavior = new SopranoSpeak();
        this.workBehavior = new BrainWork();
    }
}
