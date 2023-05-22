package pck1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularEx {
    public static void main(String[] args) {
        // Creating a regular expression pattern to match a phone number
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

        // Creating a test string with a phone number
        String testString = "ariz naqvi - 854-693-7989 - ariz.naqvi@email.com";

        // Creating a matcher object and finding the phone number in the test string
        Matcher matcher = pattern.matcher(testString);
        if (matcher.find()) {
            System.out.println("Phone number found: " + matcher.group());
        } else {
            System.out.println("Phone number not found.");
        }

        // Creating a regular expression pattern to match a date in the format "d/m/y"
        Pattern datePattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");

        // Creating a test string with a date
        String testDate = "Today's date is 11/05/2023.";

        // Creating a matcher object and finding the date in the test string
        Matcher dateMatcher = datePattern.matcher(testDate);
        if (dateMatcher.find()) {
            System.out.println("Date found: " + dateMatcher.group());
        } else {
            System.out.println("Date not found.");
        }
    }
}
