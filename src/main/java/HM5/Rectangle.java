package HM5;
//        Напиши класс Rectangle, у которого есть конструктор public
//        Rectangle(int a, int b). Он принимает два параметра - стороны
//        прямоугольника.
//
//        Напиши метод public boolean canPlaceInto(Rectangle anotherRect).
//        Он принимает другой прямоугольник, и возвращает true, если
//        текущий прямоугольник можно вписать в прямоугольник anotherRect,
//        и false в противном случае.
class Rectangle {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        if ((anotherRect.a >= a && anotherRect.b >= b) || anotherRect.a > a && b >= ((2 * anotherRect.a * anotherRect.b * a + (anotherRect.a * anotherRect.a - anotherRect.b * anotherRect.b) * Math.sqrt(anotherRect.a * anotherRect.a + anotherRect.b * anotherRect.b - a * a))) / (anotherRect.a * anotherRect.a + anotherRect.b * anotherRect.b))
           {
               return true;
        }
        return false;
    }
}
    class RectangleTest {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle(10, 5);
            Rectangle r2 = new Rectangle(3, 7);
            Rectangle r3 = new Rectangle(10, 15);

            //false
            System.out.println(r1.canPlaceInto(r2));

            //true
            System.out.println(r1.canPlaceInto(r3));

            //true
            System.out.println(r2.canPlaceInto(r3));

            //false
            System.out.println(r3.canPlaceInto(r2));
        }
    }

