import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private String email;
    private static Map<String, User> registeredUsers = new HashMap<>();
    private boolean loggedIn;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.loggedIn = false;
    }

    public void register() {
        if (registeredUsers.containsKey(email)) {
            System.out.println("User already registered.");
        } else {
            registeredUsers.put(email, this);
            System.out.println("User registered successfully.");
        }
    }

    public void login() {
        if (registeredUsers.containsKey(email)) {
            loggedIn = true;
            System.out.println(name + " logged in successfully.");
        } else {
            System.out.println("User not registered.");
        }
    }

    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println(name + " logged out successfully.");
        } else {
            System.out.println("User not logged in.");
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Ines Baghaz", "ines.baghaz@example.com");
        User user2 = new User("Lea Dumet", "lea.dumet@example.com");

        user1.register();
        user2.register();

        user1.login();
        user1.logout();

        user2.login();
        user2.logout();
    }
}

