package HW3;

public class ArlanHelper39 {
    public String drawLine(int length) {

        int a = 0;
        while(a++ < length/2){
            System.out.print("*#");
        }
        return "*";
    }
    public static void main(String[] args) {
        ArlanHelper39 helper = new ArlanHelper39();
        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(0));
    }
}

