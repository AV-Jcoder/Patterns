package Behavior.Strategy.Example_1;

public class Staff {

    WorkBehavior workBehavior;

    void performWork(){
        System.out.println(getClass());
        workBehavior.work();
    }

    public void setWorkBehavior(WorkBehavior workBehavior) {
        this.workBehavior = workBehavior;
    }

}
