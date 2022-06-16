package HM5;

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
    }
}
//16.
// class LevelTest {
//    public static void main(String[] args) {
//        //Quarke level, name is Test
//        System.out.println(new Level("Test"));
//    }
//}
//17.
// class LevelTest {
//    public static void main(String[] args) {
//        Level.Point p1 = new Level.Point(3, 5);
//        Level.Point p2 = new Level.Point(10, 100);
//        Level.Point p3 = new Level.Point(50, 40);
//
//        Level.Point[] points = {p1, p2, p3};
//
//        //Quarke level, name is Test, point count is 3
//        System.out.println(new Level("Test", points));
//    }
//}
//    16. Создай класс Level, у этого класса создай публичный конструктор, принимающий строку - название уровня.
//    Переопредели метод toString() у класса Level так, чтобы он возвращал строку вида Quarke level,
//    name is <LEVEL_NAME>, где <LEVEL_NAME> - это переданное в конструктор название уровня.
//    17. В классе Level опиши статический внутренний класс с именем Point. У этого класса должны быть два
////    приватных поля типа int с именем x и y. Для каждого поля создай публичный геттер. Также у этого
////    класса должен быть публичный конструктор, который принимает эти два параметра.
////
////    Добавь классу Level приватное поле Point[] points, и замени конструктор Level(String name) на
////    конструктор Level(String name, Point[] points).
////
////    Измени метод toString() у класса Level так, чтобы он возвращал строку вида Quarke level,
////    name is <LEVEL_NAME>, point count is <POINT_COUNT>, где <LEVEL_NAME> - имя уровня, а <POINT_COUNT>
////    - количество точек.
//18. В классе Level опиши статический внутренний класс с именем
// LevelInfo.
// У класса LevelInfo должны быть два приватных поля типа String с
// именами name и difficulty - имя и сложность уровня соответственно.
// Для этих полей объяви публичные геттеры. Также создай публичный
// конструктор LevelInfo(String name, String difficulty), в котором
// ты задашь значения этим свойствам.
// У класса Level удали поле String name. Вместо него добавь поле
// LevelInfo levelInfo, и принимай именно это поле первым параметром
// в конструкторе класса Level вместо поля String name.
// Измени метод toString() у класса Level так, чтобы он возвращал
// строку Quarke level, name is <LEVEL_NAME>, difficulty is
// <DIFFICULTY>, point count is <POINT_COUNT>. Вместо <LEVEL_NAME>
// <DIFFICULTY> <POINT_COUNT> подставь значения названия уровня,
// сложности и количества точек уровня соответственно.
// 9.
// Отлично, класс Level написан и работает так, как ожидалось.
// Нужно доделать еще последний момент, и можно отдавать в
// использование.
// Тебе нужно написать метод, который бы считал хеш уровня.
// Это число, максимально разное для каждого уровня.
// В нашем случае алгоритм хеширования очень простой. Для каждой
// точки мы умножаем координаты x и y, и складываем сумму всех
// этих умножений. Полученное число и будет хешем.
// В классе Level напиши метод calculateLevelHash(), который бы
// возвращал число в соответствии с описанным выше алгоритмом.

class Level{
    private Point[] points;
    LevelInfo levelInfo;
    Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

static class Point{
    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private Point[] points;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.name + ", difficulty is " + levelInfo.difficulty + ", point count is " + points.length;
    }

    public int calculateLevelHash(){
        int result = 0;
        for (Point point: this.points) {
            result += point.getX() * point.getY();
        }
        return result;
    }

    static class LevelInfo{
        private String name;
        private String difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
    }
}