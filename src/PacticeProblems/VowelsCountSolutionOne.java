package PacticeProblems;

import java.util.Scanner;

public class VowelsCountSolutionOne {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String inputString = str.nextLine();

        System.out.println(countVowels(inputString));
    }
    public static int countVowels(String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i ++) {
            if (isVowelsFound(inputString.charAt(i))) ++count;
        }
        return count;
    }
    public static boolean isVowelsFound(char ch) {
        char posChar = Character.toUpperCase(ch);
        return (posChar == 'A' || posChar == 'E' || posChar == 'I' || posChar == 'O' || posChar == 'U');
    }
}
