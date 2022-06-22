package HM5;
//27.
//Допиши метод setHp() в классе AIPlayer так, чтобы если значение
//переданного параметра hp было меньше 0 или больше 100, то
//бросалось бы исключение IllegalArgumentException.

class AIPlayer {
    private int hp;

    public void setHp(int hp) {
        if(hp >= 0 && hp<= 100){
            this.hp = hp;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}