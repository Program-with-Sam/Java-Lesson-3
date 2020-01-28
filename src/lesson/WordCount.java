package lesson;

public class WordCount {

    WordCount() {}

    public int count(String input) {
        // Split the string into an array
        String list[] = input.split(" ");

        // Return the number of words
        return list.length;
    }
}
