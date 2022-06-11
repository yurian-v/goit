public class SaveStarShip {

    public boolean isHangarOk(float side1, float side2, int price){
        float square = side1*side2;
        float relateSides1 = side1 / side2;
        float relateSides2 = side2 / side1;
        if ( 0.5 <= relateSides1 && relateSides1 < 2 && square >= 1500 && price/square <= 1000){
            System.out.println(relateSides1);
            System.out.println(relateSides2);
            System.out.println(square);
            System.out.println(price / square);
            return true;
        } else {
            System.out.println(relateSides1);
            System.out.println(relateSides2);
            System.out.println(square);
            System.out.println(price / square);
            return false;
        }
    }
    //square >= 1500  &&&& price/square <= 1000
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.isHangarOk(51, 102, 2663424  ));
    }
}

