package HM5;
//        Напиши статический блок инициализации, где массив POWER_2
//        инициализируется квадратами чисел от 1 до 10 включительно.
//        Используй именно статический блок инициализации, не обычный.
//static {
//        int[] POWERS_2 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
//        }

import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
    static {
        int[] POWERS_2 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
    }

}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
