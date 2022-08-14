package Behavior.Mediator.Example_1;

public interface Chat<Message> {
    void sendMessage(Message message, Client sender);
}
