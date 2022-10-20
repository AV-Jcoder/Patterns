package Behavior.Strategy.Example_1;

public class Starter {
    public static void main(String[] args) {
        Staff professor = new Professor();
        professor.performWork();

        professor = new IronMiner();
        professor.performWork();
    }
}
