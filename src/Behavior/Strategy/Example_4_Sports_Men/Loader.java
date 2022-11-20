package Behavior.Strategy.Example_4_Sports_Men;

class Loader {
    public static void main(String[] args) {
        SportsMan runnerMan = new Runner();
        SportsMan jumperMan = new Jumper();
        SportsMan walkMan = new WalkMan();
        walkMan.doMove();
        walkMan.setMoveBehavior(new RunBehavior());
        walkMan.doMove();
        walkMan.setMoveBehavior(new JumpBehavior());
        walkMan.doMove();
    }
}

