import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotMetaCharacterRegex {
    public static void main(String[] args) {

        String text = "Hello World!";

        String regex = ".";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Matches for dot (.) in the text:");
        while (matcher.find()) {
            System.out.println("Found: \"" + matcher.group() + "\" at position " + matcher.start());
        }
    }
}
