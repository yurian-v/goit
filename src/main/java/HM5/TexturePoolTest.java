package HM5;
//24.
//Напиши класс-синглтон TexturePool. У этого класса должен быть
//метод public String getTexture(String textureName). Этот метод
//возвращает строку Get texture <TEXTURE_NAME>. Вместо
//<TEXTURE_NAME> должно быть имя текстуры, которое передается как
//параметр в метод getTexture().

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
class TexturePool{
    private static final TexturePool instance = new TexturePool();

    private TexturePool() {
    }

    public static TexturePool getInstance() {
        return instance;
    }

    public String getTexture(String textureName){
        return "Get texture " + textureName;
    }
}