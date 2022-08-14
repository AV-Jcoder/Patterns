package Behavior.Strategy.Example_1;

public class IronMiner extends Worker {
    public IronMiner() {
        this.speakBehavior = new BassSpeak();
        this.workBehavior = new HandWork();
    }
}
