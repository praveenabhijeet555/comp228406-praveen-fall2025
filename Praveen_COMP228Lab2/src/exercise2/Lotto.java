package exercise2;
//Student Name: Praveen Tripathi
//Student ID: 819983180

import java.security.SecureRandom;
import javax.swing.*;

public class Lotto {

    JFrame jf;
    SecureRandom randomNum = new SecureRandom();
    private final int[] lottoArray = new int[3];

    // Constructor that randomly populates the array for a lotto object
    public Lotto() {
        for (int i = 0; i < lottoArray.length; i++) {
            lottoArray[i] = getRandomNum(1, 9);
        }
    }

    // Getter method to return the array
    public int[] getRandArray() {
        return this.lottoArray;
    }

    // Show message for winning or losing the game
    public void displayResult(String str) {
        jf = new JFrame();
        JOptionPane.showMessageDialog(null, str);
    }

    public void startGame() {

        boolean userWins = Boolean.FALSE;
        int[] randArray; // variable for random array
        int randomValSum; // variable to calculate sum of in random array

        for (int i = 0; i < 5; i++) {
            randomValSum = 0;

            // calculate sum of in random array
            randArray = getRandArray(); // Get random array
            for(int j = 0; j < 3; j++) {
                randomValSum += randArray[j]; // adding random numbers
            }

            // User input between 3 and 27 with 5 chances
            String msgPrompt = "You have with " + (5-i) + " chance to win." + "\n\nPlease enter number between 3 and 27";
            String inputValue = JOptionPane.showInputDialog(null, msgPrompt);
            String rand_val_sum = Integer.toString(randomValSum); // Convert "randomValSum" to String

            // Check user input with sum of lotto random numbers
            if (rand_val_sum.equals(inputValue)) {
                userWins = Boolean.TRUE;
                i = 5; // To exit the game if user wins (can use 'break' also)
            }
        }

        if (userWins) {
            displayResult("Great! you win the lotto"); // Message for wining the game
        }
        else {
            displayResult("Sorry!\nYou lose the game"); // Message for losing the game
        }
    }

    // Generate random numbers
    public int getRandomNum(int min, int max) {
        int random = min + randomNum.nextInt(max);
        return random;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.startGame();;

    }

}

