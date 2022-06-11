package HW3;
import java.util.Arrays;

public class UberShop32 {
    public int[] removePrice(int[] prices, int toRemove){
        int index = 0;
        for (int i = 0; i < prices.length; i++)
            if (prices[i] != toRemove)
                prices[index++] = prices[i];
                return Arrays.copyOf(prices, index);
            }

            //Test output
            public static void main(String[] args) {
                UberShop32 shop = new UberShop32();

                //Should be [150, 200]
                int[] prices = new int[]{100, 100, 100};
                int toRemove = 100;
                System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
            }
        }
