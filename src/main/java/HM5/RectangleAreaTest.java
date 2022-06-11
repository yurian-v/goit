package HM5;
import java.util.*;
import java.util.Arrays;
//        Напиши класс RectangleArea, у которого есть конструктор
//        public RectangleArea(int[] coords). Первые два элемента -
//        это x и y первой точки прямоугольника, последние два элемента -
//        это x и y противоположной точки.
//
//        У этого класса есть метод public int getArea(), который
//        возвращает площадь прямоугольника.((coords[2] - coords[0])*(coords[3] - coords[1]));
class RectangleArea{
    private int[] coords;

    public RectangleArea(int[] coords){
        this.coords = coords;

    }

    public int getArea() {
        return (Math.abs((coords[2] - coords[0])*(coords[3] - coords[1])));
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {-22, -12, 24, -36} ;

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}