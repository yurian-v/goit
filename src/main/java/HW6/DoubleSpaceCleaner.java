package HW6;
//Напиши класс DoubleSpaceCleaner. У этого класса создай метод public String clean(String phrase).
//        Метод принимает на вход строку, и возвращает ее же, только без двойных пробелов (между
//        каждым словом должен остаться ровно один пробел). Также метод должен удалить все пробелы
//        в начале и в конце строки.
class DoubleSpaceCleaner {
    public String clean(String phrase){
        return phrase.replaceAll("\\s+", " ").trim();
    }
}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}