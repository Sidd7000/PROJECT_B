import java.util.Scanner;

public class Pangram {

    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // Not a pangram
            }
        }

        return true; // All letters are present
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = in.nextLine();

        if (isPangram(str)) {
            System.out.println(str + " is a pangram.");
        } else {
            System.out.println(str + " is not a pangram.");
        }
    }
}


/* This code is contributed by Hemanth Prabhu */
