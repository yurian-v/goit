package HW3;

public class UberShop {
    public void printPrices(float[] prices) {
for (float i: prices){
    System.out.println(i + " jup");
}
    }
    public static void main(String[] args) {
        UberShop shop = new UberShop();
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}