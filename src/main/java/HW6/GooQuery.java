package HW6;
//Напиши класс, описывающий запрос к поисковой системе. Класс
//        должен называться GooQuery. У класса должен быть публичный
//        конструктор, принимающий два параметра:
//
//        language типа String - на каком языке искать указанный текст;
//
//        text типа String - какой именно текст нужно искать.
//
//        Конструктор должен сохранять эти параметры в приватные поля с
//        такими же именами. Для этих полей создай публичные геттеры.
//        Сеттеров не создавай, это иммутабельные классы.
//
//        Переопредели метод toString(), чтобы он возвращал строку вида
//        Searching [<TEXT>], using language: <LANGUAGE>. Вместо <TEXT> и
//<LANGUAGE> используй значения полей text и language
//        соответственно.
public class GooQuery {
    private String language;
    private String text;
    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    };


    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Searching [" + text + "], using language: " + language;
    }
}

class GooQueryTest {
    public static void main(String[] args) {
        GooQuery query = new GooQuery("en", "capital");

        //en
        System.out.println(query.getLanguage());

        //capital
        System.out.println(query.getText());

        //Searching [capital], using language: en
        System.out.println(query);
    }
}
