package HW3;
import java.util.Arrays;

public class ArlanHelper40 {
    public String drawPattern(char[] pattern, int repeatCount){
        String patternLine =  String.valueOf(pattern);
        int a = 0;
        while (a++ < repeatCount){
            System.out.print(patternLine);
        }
        return "";
    }
    public static void main(String[] args) {
        ArlanHelper40 helper = new ArlanHelper40();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
