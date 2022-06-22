package HM5;
//29.
//Создай свое проверяемое исключение с именем
//LevelTooBigException, унаследуясь от класса Exception.
//Бросай это исключение в методе load(Level level) класса
//LevelLoader если площадь переданного уровня больше чем
//100000 единиц.
import java.io.StringWriter;

public class Level29 {
    private int width;
    private int height;

    public Level29(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader29 {
    public void load(Level29 level) throws LevelTooBigException {
        if(level.getHeight() * level.getWidth() > 100000){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}
class LevelTooBigException extends Error{
    void errMessage(String msg){
        System.out.println(msg);
    }
}

class LevelLoaderTest29 {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader29().load(new Level29(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader29().load(new Level29(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
