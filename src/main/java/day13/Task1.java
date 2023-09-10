package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Ihor");
        User user2 = new User("Bob");

        MessageDatabase.sendMessage(user2, user1, "Hi, Ihor");
        MessageDatabase.sendMessage(user2, user1, "Are U ok?");
        MessageDatabase.sendMessage(user2, user1, "Mb go d2?");
        MessageDatabase.sendMessage(user1, user2, "Hi, Bob");
        MessageDatabase.sendMessage(user1, user2, "It`s ok, bro");
        MessageDatabase.sendMessage(user1, user2, "Let`s do this");
        MessageDatabase.sendMessage(user2, user1, "Ok, let`s go");

        MessageDatabase.showDialog(user1, user2);
    }
}
