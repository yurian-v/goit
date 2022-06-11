class MarsCalculatorFinal {

    public int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
    public int sub(int a, int b, int c) {
        int sub = 0;
        sub = a - (b + c);
        return sub;
    }
    public int multiply(int a, int b, int c) {
        //int multiply = 0;
        //multiply = sum(1, 2, 3) * sub(1, 2,3);
        return sum(a, b, c) * sub(a, b, c);
    }
    public float divide(int a, int b, int c) {
        //float divide = 0;
        //divide = sum(a, b, c) / 10f;
        return sum(a, b, c) / 10f;
    }
    public static void main(String[] args) {
        MarsCalculatorFinal math = new MarsCalculatorFinal();

        System.out.println("math.sum(1, 2, 3) = " + math.sum(1, 2, 3));
        System.out.println("math.sub(1, 2, 3) = " + math.sub(1, 2, 3));
        System.out.println("math.multiply(1, 2, 3) = " + math.multiply(1, 2, 3));
        System.out.println("math.divide(1, 2, 3) = " + math.divide(1, 2, 3));
    }
}


class Operations {
    public static void main() {
        short shouldBeIncreased = 5;
        shouldBeIncreased++;
        System.out.println(shouldBeIncreased);
    }
}

class Operations2 {
    public static void main() {
        short shouldBeIncreased = 5;
        shouldBeIncreased++;
        shouldBeIncreased--;

        System.out.println(shouldBeIncreased);
    }
}

class Counter {
    public long current(long a){
        long current = 0;
        return a;
    }
    public long next(long a){
        long next = 0;
        return ++a;
    }
    public long prev(long a){
        long prev = 0;
        return --a;
    }
    public static void main(String[] args) {
        Counter math = new Counter();

        System.out.println("current = " + math.current(5));
        System.out.println("next = " + math.next(5));
        System.out.println("prev = " + math.prev(5));

    }
}

class ScoreCounter {
    public int addScore(int currentScore, int amount){
        int addScore = 0;
        return currentScore += amount;
    }
    //Expected output
    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5));
    }
}

class ScoreCounter1 {
    public int twiceScore(int currentScore){
        int twiceScore = 0;
        return currentScore *= 2;
    }
    public static void main(String[] args) {
        ScoreCounter1 counter = new ScoreCounter1();
        System.out.println("twiceScore(7) = " + counter.twiceScore(7)); //Should be 14
    }
}


class BrokenKeyboardCalculator {
    public int add(int a, int b){
        int add = 0;
        return a += b;
    }
    public int sub(int a, int b){
        int sub = 0;
        return a -= b;
    }
    public int multiply(int a, int b){
        int multiply = 0;
        return a *= b;
    }
    public int divide(int a, int b){
        int divide = 0;
        return a /= b;
    }

    public static void main(String[] args) {
        BrokenKeyboardCalculator math = new BrokenKeyboardCalculator();

        System.out.println("add = " + math.add(5, 3));
        System.out.println("sub = " + math.sub(8, 7));
        System.out.println("multiply = " + math.multiply(1, 100));
        System.out.println("divide = " + math.divide(8, 4));
    }
}

class ProfessorHelper1 {

    public boolean areNumbersCool(int number1, int number2){
        return number1 == number2;
    }

    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
    }
}

class ProfessorHelper2{

    public boolean areNumbersFatal(int first, int second){
        return first * 5 + 3 == second;
    }

    public static void main(String[] args) {
        ProfessorHelper2 helper = new ProfessorHelper2();

        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8));
    }
}

class ProfessorHelper3 {
    public boolean canPrincessMarry(int day){
        return 16 <= day;
    }

    public static void main(String[] args) {
        ProfessorHelper3 helper = new ProfessorHelper3();
        System.out.println("canPrincessMarry(20) = " + helper.canPrincessMarry(20));
    }
}

class ProfShop {
    public boolean isPriceOk(int price){
        return price != 1000;
    }
    public float calculateRegularDiscountPrice(float price){
        return price * 0.9f;
    }
    public boolean isDiscount50(int price){
        return price * 4 == 1000;
    }
    public boolean isPriceHappy(int price, int year, int day){
        return price == year * day;
    }
    public static void main(String[] args) {
        ProfShop math = new ProfShop();
        System.out.println("isPriceOk = " + math.isPriceOk(1500));
        System.out.println("calculateRegularDiscountPrice = " + math.calculateRegularDiscountPrice(1500));
        System.out.println("isDiscount50 = " + math.isDiscount50(256));
        System.out.println("isPriceHappy" + math.isPriceHappy(23700, 3950, 6));
    }
}

class NumberTester {
    public boolean isEven(int number) {
        return number % 2 == 0 ;
    }

    //Test output
    public static void main(String[] args) {
        NumberTester tester = new NumberTester();
        System.out.println(tester.isEven(10)); //Should be true
    }
}

class NumberTester1 {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    //Test output
    public static void main(String[] args) {
        NumberTester1 tester = new NumberTester1();
        System.out.println(tester.isEven(10)); //Should be true
        System.out.println(tester.isOdd(10)); //Should be false
    }
}




