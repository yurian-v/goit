package HW3;
import java.util.Arrays;

public class CheapStocks36 {
    public String getCheapStocks(String[] stocks){
        int numberCount = stocks.length;
        String result = "Empty";
        for (int i = 0; i < stocks.length; i++){
            String text = stocks[i];
            String[] parts = text.split(" ");
            String number1 = parts[0];
            int number2 = Integer.parseInt(parts[1]);
               if (number2 < 200){
                  result += parts[0] + " ";
            }
        }
        return result;
    }




    public static void main(String[] args) {
        CheapStocks36 shop = new CheapStocks36();
        String[] stocks = new String[] {"gun 500", "firebow 70", "pixboom 200"};
        //System.out.println(shop.getCheapStocks(stocks));
    }
}