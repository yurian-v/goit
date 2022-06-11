package HW4;
//        Напиши класс Stars. В этом классе объяви поле count
//        типа int - количество звезд.
//
//        Переопредели в классе Stars метод toString().
//        Он должен возвращать количество звезд в
//        принятом в Междугалактической Гильдии Космоходцев формате.

public class Stars {
    private  int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String Operations() {
        for (int d = 0; d < ((count/1000)%10); d++) {
            System.out.print("X");
        }
        for (int c = 0; c < ((count/100)%10); c++){
            System.out.print("Y");
        }
        for (int b = 0; b < ((count/10)%10); b++){
            System.out.print("Z");
        }
        for (int a = 0; a < count%10; a++){
            System.out.print("*");
        }
        return "";
    }

    @Override
    public String toString() {
        if (count== 0) {
            return "";
        }
        return Operations();
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(8220);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}