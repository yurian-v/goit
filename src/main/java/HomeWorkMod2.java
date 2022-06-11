public class HomeWorkMod2 {}
//return sum of two numbers
    class MathUtils {
        public int sum(int a, int b) {
            int sum = 0;
            sum = a + b;
            return sum;

        }

        public static void main(String[] args) {
            MathUtils math = new MathUtils();

            //Should be 5
            System.out.println("math.sum(3, 2) = " + math.sum(3, 2));
        }
    }
    //return sub of two numbers
class MathUtils1 {
    public int sub(int a, int b) {
        int sub = 0;
        sub = a - b;
        return sub;
    }

    public static void main(String[] args) {
        MathUtils1 math = new MathUtils1();

        System.out.println("math.sub(5, 3) = " + math.sub(5, 3));
    }
}
//return number twice bigger by using devider only
class MathUtils2 {
    public float twice(float number) {
        float twice = 0;
        twice = number / 0.5f;
        return twice;
    }
//sum a + b and * 2
    //public int twicedSum(int a, int b) {
       // int twicedSum = 0;
       // sum = a + b;

       // return 2*sum(a, b);
    //}

    public static void main(String[] args) {
        MathUtils2 math = new MathUtils2();

        //Should be 14
        System.out.println("math.twice(7f) = " + math.twice(7));
    }
}
    //Метод с именем public int multiply(int a, int b, int c) не найден
        //Метод с именем public float divide(int a, int b, int c) не найден
       // Метод sum(int,int,int) не обнаружен в классе MarsCalculator
        //Метод sub(int,int,int) не обнаружен в классе MarsCalculator
       // Метод multiply(int,int,int) не обнаружен в классе MarsCalculator
        //Метод divide(int,int,int) не обнаружен в классе MarsCalculator