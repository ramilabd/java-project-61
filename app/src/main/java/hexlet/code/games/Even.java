package hexlet.code.games;

import java.lang.Math;

public class Even implements Playable {
    public final String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'";

    private int generateTask(){
        return (int)(Math.random() * 10);
    }

    private String generateCorrectAnswer(int randomNumber){
        return  (randomNumber % 2 == 0) ? "yes" : "no";
    }

    public String[] getTaskAndCorrectAnswer() {
        String[] taskAndCorrectAnswer = new String[2];
        int randomNumber = generateTask();

        taskAndCorrectAnswer[0] = String.valueOf(randomNumber);
        taskAndCorrectAnswer[1] = generateCorrectAnswer(randomNumber);

        return taskAndCorrectAnswer;
    }
}
