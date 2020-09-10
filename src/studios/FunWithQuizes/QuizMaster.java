package FunWithQuizes;

import java.util.ArrayList;

public class QuizMaster {

    ArrayList<Questions> quizQuestion;


    public void QuizGrader(Boolean submittedAnswers []) {
        int correctAnswers = 0;
        double grade = 0;

        if (quizQuestion.size() > 0) {
            for (int count = 0;  count < submittedAnswers.length;  count ++) {
                correctAnswers += submittedAnswers[count] == true? 1:0; // if true, return 1, else return 0
            }

            grade = (correctAnswers/quizQuestion.size())*100;
        }

        System.out.println("Your grade is:" + grade + "%");
    }

    public void addQuestion(Questions question) {
        quizQuestion.add(question);

    }



}


