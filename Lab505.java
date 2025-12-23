import javax.swing.*;

public class Lab505 {
    public static boolean is_palindrome(String word) {
        String cleanWord = word.toLowerCase();
        String reversedWord = "";

        for (int i = cleanWord.length() - 1; i >= 0; i--) {
            reversedWord += cleanWord.charAt(i);
        }
        return cleanWord.equals(reversedWord);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter some word:");

        if (input != null && !input.isEmpty()) {
            boolean result = is_palindrome(input);
            String message = result ? input + " is Palindrome" : input + " is NOT Palindrome";
            JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

