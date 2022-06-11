package HW3;

public class TrurlBank42 {
    public int sumQuads(int n) {
        int i = 1;
        int squareValue;
        int sum=0;
        while (i <= n){
            squareValue = (i * i);
            sum += squareValue;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        TrurlBank42 bank = new TrurlBank42();
        System.out.println(bank.sumQuads(3));
    }
}
