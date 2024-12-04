import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedSplit {


    public static String[] split(String s, String regex) {
        List<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        int lastIndex = 0;

        while (matcher.find()) {
            if (lastIndex != matcher.start()) {
                result.add(s.substring(lastIndex, matcher.start()));
            }
            result.add(matcher.group());
            lastIndex = matcher.end();
        }

        if (lastIndex < s.length()) {
            result.add(s.substring(lastIndex));
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] result1 = split("ab#12#453", "#");
        for (String str : result1) {
            System.out.println(str);
        }

        System.out.println();

        String[] result2 = split("a?b?gf#e", "[?#]");
        for (String str : result2) {
            System.out.println(str);
        }
    }
}