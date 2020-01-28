package lesson;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // Declare Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare counter
        WordCount counter = new WordCount();

        // Declare writer
        Writer writer = new Writer();

        // Declare input string
        String input = null;

        // Declare count variable
        int count = 0;

        // Write prompt text
        System.out.print("Enter your String: ");

        // Read user input
        input = scanner.nextLine();

        // Call count function in counter object
        count = counter.count(input);

        // Call write function in writer object
        writer.write("Test.txt", input, count);

        System.out.println("Process complete!");
    }
}
