public class MarsCalculator {
    static class MathUtils {
        public int sum(int a, int b, int c) {
            int sum = 0;
            sum = a + b + c;
            return sum;
            //System.out.println("math.sum(1, 2, 3) = " + sum(1, 2, 3));
        }
        public int sub(int a, int b, int c) {
            int sub = 0;
            sub = a - (b + c);
            return sub;
        }
        public int multiply(int a, int b, int c) {
            int multiply = 0;
            multiply = sum(1, 2, 3) * sub(1, 2,3);
            return multiply;
        }
        public float divide(int a, int b, int c) {
            float divide = 0;
            divide = sum(1, 2, 3) / 10f;
            return divide;
        }

        public static void main(String[] args) {
            MathUtils math = new MathUtils();


            System.out.println("math.sum(1, 2, 3) = " + math.sum(1, 2,3));
            System.out.println("math.sub(1, 2, 3) = " + math.sub(1, 2, 3));
            System.out.println("math.multiply(1, 2, 3) = " + math.multiply(1, 2, 3));
            System.out.println("math.divide(1, 2, 3) = " + math.divide(1, 2, 3));
        }
    }
}
