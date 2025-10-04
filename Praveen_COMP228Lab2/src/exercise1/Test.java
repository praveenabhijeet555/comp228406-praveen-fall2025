package exercise1;
//Student Name: Praveen Tripathi
//Student ID: 819983180

import javax.swing.*;
import java.security.SecureRandom;

public class Test {

    SecureRandom randomNumber = new SecureRandom(); // To generate random numbers
    JFrame jf; // JOptionPane for user input

    private final String[][] allQuestions =
            {{"Choose one option from 1 to 4\n\nA _____  contains the capabilities needed to develop desktop and server applications?",
              "1-Java Enterprise Edition 2 (Java 2 EE)",
              "2-Java Standard Edition 8 (Java SE 8)",
              "3-Java Enterprise Edition (Java EE)",
              "4-Java Micro Edition (Java ME)",
              "2"},
              {"Choose one option from 1 to 4\nWhat Java programs consist of pieces is called:",
              "1-Schools",
              "2-Classes",
              "3-College",
              "4-Courses",
              "2"},
              {"Choose one option from 1 to 4\nWhich IDE can be used for this course?",
              "1-Eclipse",
              "2-IntelliJ",
              "3-None of above",
              "4-Any of them",
              "4"},
              {"Choose one option from 1 to 4\nMain method should always be _______",
              "1-return type",
              "2-static",
              "3-void",
              "4-none of above",
              "2"},
              {"Choose one option from 1 to 4\nWhat is the main function of a Java compiler?",
              "1-It translates the Java source code into bytecodes that represent the tasks to execute.",
              "2-It executes the bytecodes",
              "3-It examines the bytecodes to ensure that they  are valid and do not violate Java’s security restrictions.",
              "4-It places the program in memory to execute it",
              "1"},
              {"Choose one option from 1 to 4\nWhich one of the following symbols indicates a multi-line comment in Java application source code?",
              "1-||    ||",
              "2-#     #",
              "3-/*    */",
              "4-none of above",
              "3"}};

    public String[][] simulateQuestion() {

        String[][] question_set = new String[6][6];
        for (int i = 0; i < allQuestions.length; i++) {
            for (int j = 0; j < 6; j++) {
                question_set[i][j] = allQuestions[i][j]; // Populating questions array
            }
        }

        return question_set;
    }

    public Boolean checkAnswer(String correctAns, String userInput, String correct_answer) {
        Boolean answer = Boolean.FALSE;
        jf = new JFrame();
        String msg = "";

        if (correctAns.equals(userInput)) {
            answer = Boolean.TRUE;  // // Check correct answer for a given question
        }
        else {
            answer = Boolean.FALSE;  // Check wrong answer for a given question
            msg = "\nCorrect answer:\n" + correct_answer;
        }

        JOptionPane.showMessageDialog(null, generateMessage(answer)
                + msg);

        return answer;
    }

    public String generateMessage(Boolean answer) {
        String msg = "";
        if (answer) {
            // congratulatory messages
            switch (randomNumber.nextInt(4)) {
                case 0:
                    msg = "Excellent!";
                    break;
                case 1:
                    msg = "Good!";
                    break;
                case 2:
                    msg = "Keep up the good work!";
                    break;
                case 3:
                    msg = "Nice work!";
                    break;
            }

        }
        else {
            // supportive empathy messages
            switch (randomNumber.nextInt(4)) {
                case 0:
                    msg = "No. Please try again";
                    break;
                case 1:
                    msg = "Wrong. Try once more";
                    break;
                case 2:
                    msg = "Don't give up!";
                    break;
                case 3:
                    msg = "No. Keep trying..";
                    break;
            }
        }
        return msg;
    }

    public void inputAnswer() {
        int total_correct_ans = 0;

        String[][] questions = simulateQuestion(); // Populating questions and options array
        String quiz_set; // variable displaying questions and options

        for (int i = 0; i < questions.length; i++) {
            quiz_set = "";
            for (int j = 0; j < 5; j++) {
                quiz_set = quiz_set + "\n" + questions[i][j];
            }
            String userInput = (JOptionPane.showInputDialog(quiz_set)); // user input
            String correct_answer = questions[i][5];
            int ansIndex = Integer.parseInt(correct_answer);
            String answer = questions[i][ansIndex];

            if (checkAnswer(correct_answer, userInput, answer)) {
                total_correct_ans++;
            }
        }
        jf = new JFrame();
        JOptionPane.showMessageDialog(null, "Score Board\nTotal correct answers: " + total_correct_ans +
                " \nTotal wrong answers: " + (6 - total_correct_ans) + "\nPercentage of correct answers: " + ((total_correct_ans * 100 )/ 6) + "%");

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}



