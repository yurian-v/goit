package HW3;

public class ArlanHelper37 {
    public String drawQuad(int n) {
            int a = 0;
            while(a++ < n/n){
                int b = 0;
                while(b++ < n) {
                    System.out.print("*#");
                }
                System.out.println("");
            }
            return "";
        }
        public static void main(String[] args) {
            ArlanHelper37 helper = new ArlanHelper37();
            //Should be:
            //**
            //**
            System.out.println(helper.drawQuad(5));
        }
    }

