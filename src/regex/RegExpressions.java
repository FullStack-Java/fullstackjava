package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String wordz = "Match Me Learner earner!";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(wordz);

        while (matcher.find()){
            System.out.println(wordz.substring(matcher.start(), matcher.end()));
        }

    }
}
