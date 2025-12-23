import java.util.Scanner;

public class Lab503 {
    public static int count_vowel(String message, char letter) {
    int count = 0;
    message = message.toUpperCase();
    char target = Character.toUpperCase(letter);

    for (int i = 0; i < message.length(); i++) {
        if (message.charAt(i) == target) {
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String inputMessage = scan.nextLine();

        System.out.println("\nList of vowel in \"" + inputMessage + "\"");

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (char v : vowels) {
            int result = count_vowel(inputMessage, v);
            System.out.println("The letter '" + v + "' appears " + result + " time(s).");
        }
    }
}

