package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String name;
    public static void greeting() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
