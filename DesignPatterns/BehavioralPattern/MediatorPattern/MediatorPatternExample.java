import mediator.ChatMediator;
import mediator.ChatMediatorClass;
import mediator.User;
import mediator.UserClass;

public class MediatorPatternExample {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorClass();
        User user1 = new UserClass(mediator, "hari");
        User user2 = new UserClass(mediator, "sathiya");
        User user3 = new UserClass(mediator, "Amandeep");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hi All");
        user2.send("Hi, message received");
        user3.send("Good to known!!");

    }
}
