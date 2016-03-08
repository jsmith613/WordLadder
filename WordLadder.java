import java.util.Scanner;
public class WordLadder{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first word?");
        String firstword= keyboard.nextLine();
        System.out.println("\nWhat is your second word?");
        String lastword = keyboard.nextLine();
        String word1 = firstword;
        while (!word1.equals(lastword)) {
            // System.out.println("Word1: " + word1);
            // System.out.println("LastWord: " + lastword);
            // System.out.println(word1 != lastword);
            System.out.print("\nNext Word: ");
            String nextWord = keyboard.nextLine();
            if (!checkIfValid(word1, nextWord)) {
                System.out.println("That is not a valid word ");
            } else {
                word1 = nextWord;
            }

        }
        System.out.println("Congrats!");

    }

    public static boolean checkIfValid(String word1, String word2) {
        int numOfDifferentChars = 0;

        if (!(word1.length() == word2.length())) {
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                numOfDifferentChars++;
            }
        }

        if (numOfDifferentChars != 1) {
            return false;
        }

        return true;
    }
}