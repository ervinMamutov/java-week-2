package projects.advanceCalculator;
import java.util.regex.*;

public class Verification {
    private final String userInput;
    public Verification(String userInput) {
        this.userInput = userInput;
    }

    private void verificationData() {
        String regex = "^\\s*(-?\\d+(\\.\\d+)?)\\s*([+\\-*/])\\s*(-?\\d+(\\.\\d+)?)\\s*$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);

        if(matcher.matches()) {
            String left = matcher.group(1);
            String remainderLeft = matcher.group(2);
            String operator = matcher.group(3);
            String right = matcher.group(4);
            String restRight = matcher.group(5);
        } else {
            System.out.println("Invalid input");
        }
    }

    private Number intOrDouble(String base, String remainder) {
        if (remainder == null) {
            return Integer.parseInt(base);
        } else {
            return Double.parseDouble(base);
        }
    }


}
