package Behavior.Mediator.Example_1;

public class Mediator {
    public static void main(String[] args) {

        TextChat chat = new TextChat();
        Client client1 = new User(chat,1);
        Client client2 = new User(chat,2);
        Client client3 = new User(chat,3);
        Client client4 = new User(chat,4);
        Client client5 = new User(chat,5);
        chat.addClient(client1);
        chat.addClient(client2);
        chat.addClient(client3);
        chat.addClient(client4);
//        chat.addClient(client5);

        client5.sendMessage("Hello i`m client #1");
    }
}
