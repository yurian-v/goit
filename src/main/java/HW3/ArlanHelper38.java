package HW3;

public class ArlanHelper38 {
    public String drawRect(int width, int height, char c) {
        int a = 0;
        while(a++ < width){
            int b = 0;
            while(b++ < height) {
                System.out.print(c);
            }
            System.out.println();
        }
        return "";
    }
    public static void main(String[] args) {
        ArlanHelper38 helper = new ArlanHelper38();
        System.out.println(helper.drawRect(2, 9, 'X'));
    }
}

