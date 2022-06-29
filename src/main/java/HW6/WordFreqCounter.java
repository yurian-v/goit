package HW6;
//Напиши класс WordFreqCounter. В этом классе опиши метод
//public float countFreq(String phrase, String word). Метод принимает на вход
//        строку phrase и слово word, и возвращает частоту вхождения слова в фразу.
//
//        Входная фраза phrase состоит из отдельных слов, разделенных пробелами.
//        Гарантируется, что во входной строке есть только слова, разделенные одиночными
//        пробелами, и нет других символов (знаков пунктуации).
//
//        Программа должна игнорировать регистр букв (слова, состоящие из маленьких и
//        больших букв, считаются одинаковыми).
class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String [] words = phrase.split(" ");
        int count = 0;
        int wordsCount = words.length;
        for (String oneword: words) {
            if(oneword.equalsIgnoreCase(word)){
                count++;
            }
        }
//        System.out.println(count);
//        System.out.println(wordsCount);
        return (float) count/(float) wordsCount;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
