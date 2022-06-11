package HW3;

public class TriangleDrawer41 {
    public String drawTriangle(int side){
            int a = 0;
            while(a < side) {
                int b = side;
                while((b - a) > 0) {
                    System.out.print("*");
                    b--;
                }
                System.out.println();
                a++;
            }
            return "";
        }
        public static void main(String[] args) {
            TriangleDrawer41 helper = new TriangleDrawer41();
            System.out.println(helper.drawTriangle(9));
        }
    }

