package quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Sporgsmaal question = new Sporgsmaal();
        Scanner input = new Scanner(System.in);
        question.setQuestionText("Dette er et prøve spørgsmål");
        question.setCorrectAnswer(1);
        System.out.println(question.getQuestionText());
        question.setAnswers(new String[]{"1. Dette er det korekete svar", "2. Dette er det forkerte svar", "3.Du ved godt hvad svaret er","4. Svaret er 1"});

        for (int i = 0; i< question.getAnswers().length; i++){
            String[] spoorgsmal = question.getAnswers();
            System.out.println(spoorgsmal[i]);
        }
        System.out.println("What is the correct ansawer?");

        if (input.nextInt() == question.getCorrectAnswer()){
            System.out.println("Correct!");
            question.setPoints(1);
        }else{
            System.out.println("Damn! That was the wrong answer! but thanks for playing!!");
        }

    }
}
