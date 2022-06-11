package HW3;

import java.util.Arrays;

public class UberShop2 {
    public int[] findMinMaxPrices(int[] prices) {
        int res1 = 0;
        for (int i = 0; i < prices.length; i++) {
            Arrays.sort(prices);
            res1 = prices[prices.length - 1];
            if (prices[0] < prices[1]){
                return new int[]{prices[0], res1};
            } else if (prices[0] == prices[1]){
                return new int[]{prices[0]};
            } else if (prices.length != 0){
                return new int[] {};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        UberShop2 shop = new UberShop2();
        int[] prices = new int[] {3, 4, 0, 4, 1, 8, 8, 4, 5, 8};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }
}