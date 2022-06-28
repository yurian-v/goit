package HW6;

class DoubleSpaceCleaner {
    public String clean(String phrase){
        String []words = phrase.split("\\s+");
//        StringBuilder trimmedPhrase = new StringBuilder();
//        for (String word : words) {
//            trimmedPhrase.append(word.trim()).append(" ");
//        }
        for (String word : words) {
            
        }
        return words.toString().trim().trim();
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