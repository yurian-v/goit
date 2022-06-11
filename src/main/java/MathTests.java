public class MathTests {
    public static void main(String[] args) {
        int w = 5;
        int h = 10;
        int s = h * w;
        System.out.println(s);


        int age = 10;
        age = age +1;  //age++;
        System.out.println(age);

        age = age + 5; // age +=5; +=, -=, *=, /=;

        int weight = 1000;
        weight /= 5;
        System.out.println(weight);

        int mod = 11 % 4;
        System.out.println(mod);

        int number = 95;
        boolean zerEnds = number % 15 == 0;
        System.out.println(zerEnds);
        System.out.println(5!= 5);
        System.out.println(4!= 5);
        System.out.println(20 <= 21);

        char c = '9';
        boolean isDigid = c >= '0' || c <= '9';
        System.out.println(isDigid);



    }
}
