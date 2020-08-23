package exercises.ControlFlowAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        String phrases = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
        String[] words = phrases.split(",|\\s|\\.");


        sumOddNumbers(nums);
        printWord(words);

    }

    public static void sumOddNumbers(ArrayList<Integer> nums) {
        int odd = 0;
        for (Integer num : nums) {
            if (num % 2 != 0) {
                odd += num;
            }
        }
        System.out.println(odd);
    }

    public static void printWord(String[] words) {
        List<String> al;
        al = Arrays.asList(words);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the word to search: ");
        int searchLength = Integer.parseInt(input.nextLine());

        for (String s : al) {
            if (s.length() == searchLength) {
                System.out.println(s);
            }
        }
    }
}