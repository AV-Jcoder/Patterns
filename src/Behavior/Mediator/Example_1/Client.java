package Behavior.Mediator.Example_1;

public interface Client<Message> {

    void printMessage(Message message);
    void sendMessage(Message message);

}
