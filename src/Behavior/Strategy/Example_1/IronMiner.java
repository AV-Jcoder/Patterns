package Behavior.Strategy.Example_1;

public class IronMiner extends Staff {
    public IronMiner() {
        this.workBehavior = new HandWork();
    }
}
