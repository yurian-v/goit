import java.math.BigDecimal;

public class Conversion {
    public static void main(String[] args) {
        //float x = 6d;
        float x = (float)6d;
        System.out.println("x = " + x);

        //int i = 77777999999L;
        int i = (int) 7777799999999L;
        System.out.println("i = " + i);

        int intValue = (int) 6.51d;
        System.out.println("intValue = " + intValue);

        System.out.println("Math.round(6.51d) = " + Math.round(6.51d));
        System.out.println("Math.round(6.49d) = " + Math.round(6.49d));

        float fvalue = 0.3f + 0.3f + 0.1f + 0.1f;
        System.out.println("fvalue = " + fvalue);

        BigDecimal bdResult =
                new BigDecimal("0.3")
                        .add (new BigDecimal(0.3))
                        .add (new BigDecimal(0.1))
                        .add (new BigDecimal(0.1));
        System.out.println("bdResult = " + bdResult);


    }
}
