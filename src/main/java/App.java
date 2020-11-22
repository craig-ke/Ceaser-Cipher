import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to ceaser cypher. Do you want to encrypt or decrypt?");
        String userChoice = myConsole.readLine();
    }
}
