package HM5;
//        Напиши класс TargetFinder. Этот класс имеет метод
//        public int[] findTarget(int[] aiCoords, int[][] targets).
//        Этот метод принимает два параметра:
//
//        aiCoords - координаты точки, где сейчас находится ИИ.
//        Это массив из двух элементов, x и y соответственно;
//        targets - двумерный массив. Каждый элемент массива -
//        это массив из двух элементов, x и y потенциальной цели
//        соответственно.
//
//        Метод возвращает точку ближайшей цели из массива targets.
//        Это массив из двух точек - x и y соответственно.
import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets){
int[] nearestTarget = aiCoords;


        return nearestTarget;
    }
}
