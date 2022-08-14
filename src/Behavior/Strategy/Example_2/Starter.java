package Behavior.Strategy.Example_2;

public class Starter {
    public static void main(String[] args) {

        ParentClass child1 = new Child1();
        ParentClass child2 = new Child2();

        child1.performBehavior1();
        child1.performBehavior2();

        child2.performBehavior1();
        child2.performBehavior2();
        child2.setBhi2(new Int2_Imp1());
        child2.performBehavior2();


    }
}
