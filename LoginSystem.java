import java.util.Scanner;

interface Login {
    boolean authenticate(String username, String password);
}

class UserLogin implements Login {
    private String storedUsername = "Gowtham";
    private String storedPassword = "A.g.r@1432";

    @Override
    public boolean authenticate(String username, String password) {
        return storedUsername.equals(username) && storedPassword.equals(password);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userLogin.authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please try again.");
        }

        scanner.close();
    }
}
