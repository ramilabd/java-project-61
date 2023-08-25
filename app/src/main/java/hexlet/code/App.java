package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        System.out.println("""
                1 - Greet
                2 - Even
                0 - Exit""");

        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Your choice: " + choice);
            Cli.greeting();
        } else if (choice == 2) {
            Even evenGame = new Even();
            Engine engine = new Engine();
            engine.playGame(evenGame);

        }
    }
}
