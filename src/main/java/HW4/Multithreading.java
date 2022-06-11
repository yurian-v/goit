package HW4;

public class Multithreading {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++){
            MultithreadingThing myThing = new MultithreadingThing();
            myThing.start();
        }
        //MultithreadingThing myThing = new MultithreadingThing();
        //MultithreadingThing myThing2 = new MultithreadingThing();
        //myThing.run();
        //myThing2.run();
        //myThing.start();
        //myThing2.start();
    }
}
