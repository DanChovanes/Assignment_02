//Dan Chovanes
//Code provided by Robert LaFore and Deborah Whitfield
//Once again, the only one reading this is me.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a phrase (or 'quit'): ");
        String phrase = kbd.nextLine();
        while (!phrase.equals("quit"))
        {
            //System.out.print(phrase);
            if (isPalindromeSTACK(phrase)
                    && isPalindromeQUEUE(phrase))
                System.out.println(" is a palindrome");
            else
                System.out.println(" is NOT a palindrome");
            System.out.print("Enter a phrase (or 'quit'): ");
            phrase = kbd.nextLine();
        }
    }
//---------------------------------------------------------------
    private static boolean isPalindromeSTACK(String word) {
        String reversed = "";
        StackX newStack = new StackX(word.length());

        for (int i=0; i < word.length();i++)
            newStack.push(word.charAt(i));

        while (!newStack.isEmpty())
            reversed += newStack.pop();

        return word.equals(reversed);
    }
//---------------------------------------------------------------
    private static boolean isPalindromeQUEUE(String word)
    {
        String reversed = "";
        QueueX myQueue = new QueueX(word.length());

        for (int i=0; i<word.length();i++)
            myQueue.insert(word.charAt(i));

        while (! myQueue.isEmpty())
            reversed += myQueue.remove();

        return word.equals(reversed);
    }
}
