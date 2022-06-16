package HM5;
//25.
//Исправь класс AvgDamageCalculator, дописав метод calculateAvg()
//так, чтобы если мы передаем пустой массив и происходит деление
//на 0, то эта исключительная ситуация обработалась, и метод
//возвратил значение 0.
//Не используй условные операторы if, используй именно обработку
//исключений try...catch.

class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }
        try{
            sum /= samples.length;
        }catch(ArithmeticException e){
            return 0;
        }

        return sum;
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}