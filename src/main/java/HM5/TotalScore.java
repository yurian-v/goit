package HM5;
//28.
//Сделай рефакторинг метода sum() в классе TotalScore. Метод должен
//работать точно так же, как и работал, но внутри метода не
//используй перехват исключения (ключевые слова try...catch).
//Перепиши этот метод на нормально работающий Java-код.

class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        for (int i = 0; i < scores.length; i++){
            result = result + scores[i];
        }
        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}