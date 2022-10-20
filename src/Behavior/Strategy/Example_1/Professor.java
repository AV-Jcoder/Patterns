package Behavior.Strategy.Example_1;

public class Professor extends Staff {
    Professor () {
        this.workBehavior = new BrainWork();
    }
}
