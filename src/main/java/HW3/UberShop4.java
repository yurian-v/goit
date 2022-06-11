package HW3;

import java.util.Arrays;

public class UberShop4 {
    public static int[] removePrice(int[] prices, int toRemove) {
        //Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        int i = 0;
        int j = 0;
        //int k = 0;
        int[] newArr = null;
        for (i = 0; i < prices.length; i++) {
            //prices[i] = prices[i + 1];
            if (prices[i] == toRemove) {
                //System.out.print(prices);
                newArr = new int[prices.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = prices[index];
                }  if (prices[i] == toRemove) {
                    //System.out.print(prices);
                    newArr = new int[prices.length - 1];
                    for (int index = 0; index < i; index++) {
                        newArr[index] = prices[index];
                    }
                    for (int y = i; y < prices.length - 1; y++) {
                        newArr[y] = prices[j + 1];
                    }
                    break;
                }
            }
            return null;
        }
        return newArr;
    }
    public static void main(String[] args) {
        UberShop4 shop = new UberShop4();

        //Should be [150, 200]
        int[] prices = new int[]{9, 3, 1, 3, 6, 3, 7, 3, 2, 6};
        int toRemove = 3;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }
}