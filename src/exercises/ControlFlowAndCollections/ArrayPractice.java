package exercises.ControlFlowAndCollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        String phrases = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
        String[] words = phrases.split("\\.");
        System.out.println("separated words: " + phrases);
        System.out.println("output string: " + Arrays.toString(words));


        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i <= numArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");

            }
        }
    }
}