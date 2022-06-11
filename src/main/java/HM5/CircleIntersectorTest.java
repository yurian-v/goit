package HM5;
//        Напиши класс CircleIntersector. Создай у этого класса конструктор
//        public CircleIntersector(int x1, int y1, int r1, int x2, int y2,
//        int r2).
//
//        Параметры x1, y1, r1 - это координаты первого круга. Параметры
//        x2, y2, r2 - это координаты второго круга.
//
//        Переопредели метод toString() так, чтобы он возвращал intersects,
//        если круги пересекаются, и not intersects, если не пересекаются.
class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}
class CircleIntersector{
    private int x1;
    private int x2;
    private int y2;
    private int y1;
    private int r1;
    private int r2;

    @Override
    public String toString() {
        double someV = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (someV > r1 + r2){
            return "not intersects";
        }
        return "intersects";
    }

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.r1 = r1;
        this.r2 = r2;
    }
}