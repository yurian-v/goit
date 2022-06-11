package HW3;

public class ATM44 {
    public int countBanknotes(int sum){
            int count = 0;
            int i = 10000;
            int j = 100;
            while (sum != 0){
                while (sum != 0){
                    if (sum % i >= j * 5) {
                        sum -= j*5;
                        count++;
                        System.out.println(sum);
                    }else
                    if (sum % i >= j*2){
                        sum -= j*2;
                        count++;
                        System.out.println(sum);
                    } else
                    if (sum % i >= j*1){
                        sum -= j*1;
                        count++;
                        System.out.println(sum);
                    } else
                    if (sum % i >= j/2){
                        sum -= j/2;
                        count++;
                        System.out.println(sum);
                    } else
                    if (sum % i >= j/5){
                        sum -= j/5;
                        count++;
                        System.out.println(sum);
                    } else
                    if (sum % i >= j/10){
                        sum -= j/10;
                        count++;
                        System.out.println(sum);
                    } else
                    if (sum % i >= j/20){
                        sum -= j/20;
                        count++;
                        System.out.println(sum);
                    } else
                    if (sum % i >= j/50){
                        sum -= j/50;
                        count++;
                        System.out.println(sum);
                    } else {
                        sum -= j/100;
                        count++;
                        System.out.println(sum);
                    }
                }
            }
            return count;
        }
    public static void main(String[] args) {
        ATM44 bank = new ATM44();
        System.out.println(bank.countBanknotes(578));
    }
}
