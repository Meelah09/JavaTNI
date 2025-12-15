public class Lab404 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        StringBuilder sentenceBuilder = new StringBuilder();
        String word;

        System.out.println("Start entering words. Type 'stop' to finish.");

        while (true) {
            System.out.print("Enter word: ");
            word = scanner.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }

            sentenceBuilder.append(word).append(" ");
        }
        String finalSentence = sentenceBuilder.toString().trim();

        System.out.println("\n--- Final Output ---");
        System.out.println(finalSentence);

    }
}

