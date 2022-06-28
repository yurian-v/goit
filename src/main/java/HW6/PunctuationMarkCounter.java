package HW6;
//Напиши класс PunctuationMarkCounter. В этом классе создай метод
//public int count(String phrase). Он принимает строку, и возвращает
//        количество знаков пунктуации в этой строке.
//
//        Знаками пунктуации считаются следующие: ., ,, !, :, ;.
public class PunctuationMarkCounter {
    public int count(String phrase) {
        char[] puncts = new char[]{'.', ',', '!', ':', ';'};
//        System.out.println(puncts);
        char[] symbolsFromPhrase = phrase.toCharArray();
//        System.out.println(symbolsFromPhrase);
        int marksCount = 0;
        for(char punct : puncts){
            for(char symbol : symbolsFromPhrase){
                if (punct == symbol){
                   marksCount++;
                }
            }
        }
        return marksCount;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
