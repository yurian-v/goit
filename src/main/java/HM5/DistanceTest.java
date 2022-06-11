package HM5;
//        Напиши класс Distance, у которого есть конструктор
//        Distance(int startX, int startY, int endX, int endY).
//        Этот конструктор принимает 4 параметра - координаты
//        начальной точки (startX и startY), и координаты конечной
//        точки (endX и endY).
//
//        У класса также должен быть метод public int getDistance().
//        Он возвращает расстояние между точками, координаты которых
//        переданы в конструктор. Расстояние округляется по правилам
//        математического округления, возвращается целый результат.
import java.util.*;
class Distance {
        private int startX;
        private int endX;
        private int endY;
        private int startY;

        public Distance(int startX, int startY, int endX, int endY) {
                this.startX = startX;
                this.startY = startY;
                this.endX = endX;
                this.endY = endY;
        }
        public int getDistance() {
                double d = Math.round(Math.sqrt(((startX - endX) * (startX - endX)) + ((endY - startY) * (endY - startY))));
                return (int) d;
        }
}
        class DistanceTest {
                public static void main(String[] args) {
                        //Expect 14
                        System.out.println(new Distance(10, 10, 20, 20).getDistance());

                        //Expect 23
                        System.out.println(new Distance(10, 10, 27, 25).getDistance());
                }
        }


