import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String str = "This is simple example to check wheather a sentence starts with capital letter and ends with a period.";
        Pattern p = Pattern.compile("^[A-Z].*\\.$");
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.print("Start index: " + m.start());
            System.out.print(" End index: " + m.end() + "\n ");
            System.out.println(m.group());
        }
    }
}
