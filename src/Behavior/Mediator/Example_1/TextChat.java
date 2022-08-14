package Behavior.Mediator.Example_1;

import java.util.LinkedList;
import java.util.List;

public class TextChat implements Chat<String>{

    private List<Client> clientsList;

    TextChat() {
        this.clientsList = new LinkedList<Client>();
    }

    void addClient(Client client){
        clientsList.add(client);
    }

    @Override
    public void sendMessage(String text, Client sender) {
        for (Client receiver : clientsList) {
            if (receiver!=sender) {
                receiver.printMessage(text);
            }
        }
    }

}
