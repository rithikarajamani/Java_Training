import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String[] args) {

        String text = "Hello World! This is a Regex Example.";

        String regex = "[aeiouAEIOU]";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Matched vowels in the text:");
        while (matcher.find()) {
            System.out.println("Found: \"" + matcher.group() + "\" at position " + matcher.start());
        }
    }
}
