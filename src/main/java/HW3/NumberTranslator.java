package HW3;

import java.util.Locale;

public class NumberTranslator {
    public int translate(String romanNumber){
        String digit = romanNumber.toLowerCase().trim();
        //Int wrongNumber = - 1;
       int digitName = 0;


        switch(digit) {
            case "i":
                digitName = 1;
                break;
            case "ii":
                digitName = 2;
                break;
            case "iii":
                digitName = 3;
                break;
            case "iv":
                digitName = 4;
                break;
            case "v":
                digitName = 5;
                break;
            case "vi":
                digitName = 6;
                break;
            case "vii":
                digitName = 7;
                break;
            case "viii":
                digitName = 8;
                break;
            case "ix":
                digitName = 9;
                break;
            case "x":
                digitName = 10;
                break;
            case "xi":
                digitName = 11;
                break;
            case "xii":
                digitName = 12;
                break;
            //default:
                //digitName = "Unknown";
        }
        return digitName;
    }
    public static void main (String[]args){
        NumberTranslator num = new NumberTranslator();
        System.out.println(num.translate("xi"));
    }
}
