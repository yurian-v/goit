package HW3;

import java.util.Arrays;

public class UberShop33 {
    public int[] leavePrice9(int[] prices){
        int index = 0;
        for (int i = 0; i < prices.length; i++)
            if (prices[i]%10 == 9)
                prices[index++] = prices[i];
        return Arrays.copyOf(prices, index);
    }
    public static void main(String[] args) {
        UberShop33 shop = new UberShop33();

        //Should be [1599, 399]
        int[] prices = new int[]{399, 1599, 399, 50, 10, 10, 70};
        System.out.println(Arrays.toString(shop.leavePrice9(prices)));
    }
}
