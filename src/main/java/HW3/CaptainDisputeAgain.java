package HW3;

import java.util.Arrays;

public class CaptainDisputeAgain {
    public int findMin(int[] triple){
       int[] tripleCopy = triple;
        Arrays.sort(tripleCopy);
        System.out.println("tripleCopy[0] = " + tripleCopy[0]);
        return tripleCopy[0];
    }
    public static void main(String[] args) {
        //System.out.println(tripleCopy[0]);
        CaptainDisputeAgain ship = new CaptainDisputeAgain();
        System.out.println(ship.findMin(new int[] {238, 595, 360}));
        }
    }
