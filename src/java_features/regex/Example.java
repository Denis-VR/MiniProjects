package java_features.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("1\\+2");
        //Pattern p = Pattern.compile("\\Q1+2=\\E");
        //Pattern p = Pattern.compile("gr[ea]y");
        Pattern p = Pattern.compile("[]*^+]");
        //Matcher m = p.matcher("greay");
        Matcher m = p.matcher("g*re^]a+y");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
