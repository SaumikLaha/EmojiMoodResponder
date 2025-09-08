import java.util.Scanner;

public class EmojiMoodResponder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("😊 Welcome to the Emoji Mood Responder!");
        System.out.println("Please describe how you feel (e.g., happy, sad, angry, tired, excited).");
        System.out.println("Type 'exit' to quit the program.");

        while (true) {
            System.out.print("Enter your mood: ");
            String moodInput = scanner.nextLine().toLowerCase(); // make case-insensitive

            if (moodInput.equals("exit")) {
                System.out.println("Goodbye! Take care! 👋");
                break;
            }

            respondToMood(moodInput);
        }

        scanner.close();
    }

    public static void respondToMood(String moodInput) {
        boolean found = false;

        if (moodInput.contains("happy")) {
            System.out.println("You seem cheerful! 😊");
            found = true;
        }
        if (moodInput.contains("sad")) {
            System.out.println("Cheer up! Here’s a virtual hug 🤗");
            found = true;
        }
        if (moodInput.contains("angry")) {
            System.out.println("Take a deep breath 😤");
            found = true;
        }
        if (moodInput.contains("tired")) {
            System.out.println("Rest well 😴");
            found = true;
        }
        if (moodInput.contains("excited")) {
            System.out.println("Let’s celebrate! 🥳");
            found = true;
        }

        if (!found) {
            System.out.println("I can't quite understand how you feel. Please try again. 🤔");
        }
    }
}
