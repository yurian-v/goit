package HW3;

public class UberShop35 {
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        int i;
        for (i = 0; i < prices.length; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                sum += prices[i];
            }
        }
        return (sum);
    }
    public static void main(String[] args) {
        UberShop35 shop = new UberShop35();
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}

