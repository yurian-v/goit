package HW6;
import java.util.Arrays;
//Напиши класс Phrase.
//
//        У класса должен быть публичный конструктор, принимающий один
//        параметр:
//
//        String[] words - список слов.
//
//        Конструктор должен сохранить этот параметр в приватное поле с
//        таким же именем. Не создавай для этого поля ни геттеров,
//        ни сеттеров.
//
//        Переопредели метод toString() у этого класса, чтобы он возвращал
//        строку, состоящую из элементов поля words, разделенных пробелом.
//
//        Позаботься о иммутабельности класса. Если мы меняем массив,
//        который передавали классу Phrase, внутреннеe поле words не должно
//        меняться.
public class Phrase {
    private String[] words;
    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(words).replace(",", "").replace("[", "").replace("]", "");
    }
}


class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
