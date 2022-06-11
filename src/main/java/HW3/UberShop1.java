package HW3;
import java.util.Arrays;

public class UberShop1 {
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float result = prices[i];
            if (result < 1000) {
                float varie1 = result * 2f;
                prices[i] = varie1;
            } else if (result >= 1000) {
                float varie2 = result * 1.5f;
                prices[i] = varie2;
            }
        }
    }
    public static void main(String[] args) {
        UberShop1 shop = new UberShop1();
        float[] prices = new float[] {100f, 1500f};
        shop.multiplyPrices(prices);
    }
}