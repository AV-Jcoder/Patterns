package Behavior.Mediator.Example_1;

public class User implements Client<String>{

    private Chat chat;
    private int id;

    public User(Chat chat, int id) {
        connectToChat(chat);
        this.id = id;
    }

    void connectToChat(Chat chat){
        this.chat = chat;
    }
    @Override
    public void printMessage(String text) {
        System.out.printf("User id:%s get message: ",this.id);
        System.out.println(text);
    }

    @Override
    public void sendMessage(String text) {
        chat.sendMessage(text,this);
    }
}
