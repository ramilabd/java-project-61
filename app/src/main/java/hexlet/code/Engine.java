package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;

public class Engine {
    Scanner scan = new Scanner(System.in);
    public void playGame(Even evenGame){
        Cli.greeting();
        System.out.println(evenGame.gameRule);
        String gamer = Cli.name;
        int i = 1;

        int roundsCount = 3;
        while (i <= roundsCount) {
            String[] taskAndCorrectAnswer = evenGame.getTaskAndCorrectAnswer();
            String task = taskAndCorrectAnswer[0];
            String correctAnswer = taskAndCorrectAnswer[1];

            System.out.println("Question: " + task);
            String answerUser = scan.next();
            System.out.println("Your answer: " + answerUser);

            if (answerUser.equals(correctAnswer)) {
                System.out.println("Correct!");
                if (i == roundsCount) {
                    System.out.println("Congratulations, " + gamer);
                    break;
                }
                i++;
            } else {
                System.out.println("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " +
                        "'" + correctAnswer + "'" + "\n" +
                        "Let's try again, " + gamer);
                scan.close();
                break;
            }
        }
        scan.close();
    }
}
