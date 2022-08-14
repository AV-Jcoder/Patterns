package Behavior.Strategy.Example_2;

public class ParentClass {
    BehaviorInterface_1 bhi1;
    BehaviorInterface_2 bhi2;

    void performBehavior1(){
        bhi1.someBehavior1();
    }
    void performBehavior2(){
        bhi2.someBehavior2();
    }

    public void setBhi1(BehaviorInterface_1 bhi1) {
        this.bhi1 = bhi1;
    }

    public void setBhi2(BehaviorInterface_2 bhi2) {
        this.bhi2 = bhi2;
    }
}
