package HM5;
//21.
//Напиши класс LevelLoader. У этого класса создай метод
//String load(String levelName). Метод принимает один параметр -
//имя уровня, и возвращает строку Loading level <LEVEL_NAME> ...,
//где вместо <LEVEL_NAME> подставляется переданное имя уровня.
//22.
//Первое действие - нужно добавить приватное статическое поле с
//именем instance типа LevelLoader в класс LevelLoader. Это поле
//сразу инициализируй новым экземпляром LevelLoader (вызовом new
//LevelLoader()).
//Создай статический публичный метод LevelLoader getInstance(),
//который будет возвращать instance.
//23.
//Создай в классе LevelLoader приватный конструктор без параметров. Других конструкторов быть не должно.

//21 - 22.
//class LevelLoaderTest {
//    public static void main(String[] args) {
//        LevelLoader levelLoader = new LevelLoader();
//
//        //Loading level Startlevel ...
//        System.out.println(levelLoader.load("StartLevel"));
//    }
//}
//23.
class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
class LevelLoader{
    private LevelLoader() {
    }

    private static LevelLoader instance  = new LevelLoader();
    public static LevelLoader getInstance(){
        return instance;
    }
    String load(String levelName){
        return "Loading level " + levelName + " ...";
    }
}