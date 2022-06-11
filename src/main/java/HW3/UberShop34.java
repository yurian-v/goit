package HW3;
import java.util.Arrays;

public class UberShop34 {
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] together = new String[showcaseStocks.length + warehouseStocks.length];
        int count = 0;
        int i;
        int j;
        for (i = 0; i < showcaseStocks.length; i++) {
            together[i] = showcaseStocks[i];
            count++;
        }
        for (j = 0; j < warehouseStocks.length; j++) {
            // together[i] = showcaseStocks[i];
            together[count++] = warehouseStocks[j];
        }
        for (i = 0; i < together.length; i++) {
            System.out.println(" ");
        }
        return together;
    }
    public static void main(String[] args) {
        UberShop34 shop = new UberShop34();

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}
