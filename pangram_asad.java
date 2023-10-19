import java.io.*;
import java.util.Scanner;

class Pangram {

    // Returns true if the string
    // is pangram else false
    public static boolean checkPangram(String str)
    {
        
        boolean[] mark = new boolean[26];
        int index = 0;
        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= str.charAt(i)
                && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

            // If lowercase character, subtract 'a'
            // to find index.
            else if ('a' <= str.charAt(i)
                    && str.charAt(i) <= 'z')

                index = str.charAt(i) - 'a';

            // If this character is other than english
            // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);

        // If all characters were present
        return (true);
    }

    // Driver Code
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER Sentence : ");
        String str=in.nextLine();

        if (checkPangram(str) )
            System.out.print(str + " \nis a pangram.");
        else
            System.out.print(str + " \nis not a pangram.");
    }
}
