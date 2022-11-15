package Behavior.Strategy.Example_3;

public class Person {
    private Behavior beh;

    Person (Behavior beh){
        this.beh = beh;
    }

    void doSomething() {
        beh.doSome();
    }

    void setBeh(Behavior beh){
        this.beh = beh;
    }
}
