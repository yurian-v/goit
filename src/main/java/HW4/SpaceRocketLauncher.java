package HW4;
public class SpaceRocketLauncher {
    private int smallRocketCount;
    private int bigRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if(bigRocketCount > 0 && bigRocketCount <= 100)
            this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount > 0 && smallRocketCount <= 100)
            this.smallRocketCount = smallRocketCount;
    }
    public int launchBigRocket() {
        if(bigRocketCount > 0) {
            System.out.println("Launch big rocket");
            this.bigRocketCount = bigRocketCount - 1;
        }
        return 0;
    }

    public int launchSmallRocket() {
        if(smallRocketCount > 0) {
            System.out.println("Launch small rocket");
            this.smallRocketCount = smallRocketCount - 1;
        }
        return 0;
    }

    public int getTotalPower() {
        return getBigRocketCount() * 100 + getSmallRocketCount() * 50;
    }
}