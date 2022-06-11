package HW3;

public class TrurlBank43 {
    public int countSumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number/=10;
    }
        return sum;
    }
    public static void main(String[] args) {
        TrurlBank43 bank = new TrurlBank43();
        System.out.println(bank.countSumOfDigits(547));
    }
}