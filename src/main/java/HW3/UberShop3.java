package HW3;

import java.util.Arrays;

public class UberShop3 {
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
           return 0;
        }
        Arrays.sort(prices);
        int min = prices[0];
        int k = 0;
        for (int price : prices) {
            if (price == min) {
                k++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        UberShop3 shop = new UberShop3();
        int[] prices = new int[] {100, 1500, 300, 50, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(prices)); //Should be 2
    }
}