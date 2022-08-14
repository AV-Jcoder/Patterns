package Behavior.Strategy.Example_1;

public class Worker {

    WorkBehavior workBehavior;
    SpeakBehavior speakBehavior;

    void performWork(){
        workBehavior.work();
    }

    void performSpeak(){
        speakBehavior.speak();
    }

    public void setWorkBehavior(WorkBehavior workBehavior) {
        this.workBehavior = workBehavior;
    }

    public void setSpeakBehavior(SpeakBehavior speakBehavior) {
        this.speakBehavior = speakBehavior;
    }
}
