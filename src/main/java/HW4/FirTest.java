package HW4;
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}


class FirNum {
    public int calc(int n) {
        return n;
    }
}




//    task 27. Создай класс FirNumSum, который наследуется от класса
//        FirNum. Переопредели у этого класса метод calc()
//        так, чтобы он возвращал сумму чисел от 1 до
//        переданного параметра n включительно.
class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

//      task 28. Создай класс FirNumFactorial, который наследуется от
//              класса FirNum. Переопредели у этого класса метод
//              calc() так, чтобы он возвращал факториал n.
class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
//        task 29. Создай класс FirNumMultiplyOdd, который наследуется
//                от класса FirNum. Переопредели у этого класса метод
//                calc() так, чтобы он возвращал произведение нечетных
//                чисел от 1 до n включительно.

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int odd = 0;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                odd = odd * i;
            }
        }
        return odd;
    }
}

//task 29. Создай класс FirNumFizzBuzz, который наследуется
//        от класса FirNum. Переопредели у этого класса метод
//        calc() так, чтобы он возвращал сумму чисел от 1 до n
//        включительно согласно алгоритма FizzBuzz.
class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int three = 0;
        int five = 0;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0){
            } else if (i % 3 == 0) {
                three = three + i;
            } else if (i % 5 == 0){
                five = five + i;
            }
        }
        return result = five + three;
    }
}

//task 31. Создай класс FirNumBasis, который наследуется
//        от класса FirNum. Переопредели у этого класса
//        метод calc() так, чтобы он возвращал фирский
//        базис числа n включительно согласно алгоритму,
//        описанному в теории.
class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int sumEven = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
        }
        return sumEven/2;
    }
}


