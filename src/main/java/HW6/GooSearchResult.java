package HW6;
import java.net.*;
import java.net.URL;
//Напиши класс GooSearchResult.
//
//        У класса должен быть публичный конструктор, принимающий один
//        параметр:
//
//        url типа String - URL страницы с искомой информацией;
//
//        Конструктор должен сохранить этот параметр в приватное поле с
//        таким же именем. Создай для этого поля публичный геттер. Сеттер
//        не создавай, это иммутабельный класс.
//
//        Напиши в этом классе метод parseDomain(), который будет выделять
//        домен из поля url.
class GooSearchResult {
    private String url;

    public String getUrl() {
        return url;
    }

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String parseDomain(){
        return url.replace("http://", "").replace("https://", "").replace("/news", "");
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
