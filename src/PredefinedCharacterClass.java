import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClass {
    public static void main(String[] args) {
        // Input text to search through
        String text = "The year is 2024$, and the temperature is 23/n degrees.";

        // Regex pattern to match digits
        String regex1 = "\\d";
        String regex2 = "\\D";
        String regex3 = "\\w";
        String regex4 = "\\W";
        String regex5 = "\\s";
        String regex6 = "\\S";


        // Compile the regex pattern
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);
        Pattern pattern4 = Pattern.compile(regex4);
        Pattern pattern5 = Pattern.compile(regex5);
        Pattern pattern6 = Pattern.compile(regex6);

        // Create a matcher for the input text
        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);
        Matcher matcher3 = pattern3.matcher(text);
        Matcher matcher4 = pattern4.matcher(text);
        Matcher matcher5 = pattern5.matcher(text);
        Matcher matcher6 = pattern6.matcher(text);


        // Find and print all matches
        System.out.println("Matched digits in the text:");
        while (matcher1.find()) {
            System.out.println("Found: \"" + matcher1.group() + "\" at position " + matcher1.start());
        }
        System.out.println("Matched non-digits in the text:");
        while (matcher2.find()) {
            System.out.println("Found: \"" + matcher2.group() + "\" at position " + matcher2.start());
        }
        System.out.println("Matched words in the text:");
        while (matcher3.find()) {
            System.out.println("Found: \"" + matcher3.group() + "\" at position " + matcher3.start());
        }
        System.out.println("Matched non-words in the text:");
        while (matcher4.find()) {
            System.out.println("Found: \"" + matcher4.group() + "\" at position " + matcher4.start());
        }
        System.out.println("Matched whitespace in the text:");
        while (matcher5.find()) {
            System.out.println("Found: \"" + matcher5.group() + "\" at position " + matcher5.start());
        }
        System.out.println("Matched non-whitespace in the text:");
        while (matcher6.find()) {
            System.out.println("Found: \"" + matcher6.group() + "\" at position " + matcher6.start());
        }
    }
}
