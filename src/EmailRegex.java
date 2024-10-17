import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static void main(String[] args) {

        String text = "Please contact us at support@example.com for assistance.";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Matched email addresses:");
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }
}
