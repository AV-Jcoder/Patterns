package Behavior.Strategy.Example_1;

public class DayOfWork {
    public static void main(String[] args) {
        Worker professor = new Professor();
        professor.performSpeak();
        professor.performWork();

        professor = new IronMiner();
        professor.performSpeak();
        professor.performWork();
    }
}
