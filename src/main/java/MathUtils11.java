
public class MathUtils11 {
    public int sum(int a, int b) {
        return a + b;
    }
    public int twicedSum(int a, int b){
 //       int sum = a + b;
        return 2 * sum(a, b);
    }

    public static void main(String[] args) {
        MathUtils11 math = new MathUtils11();
        //Should be 10
        System.out.println("math.twicedSum(2, 3) = " + math.twicedSum(2, 3));
    }
}