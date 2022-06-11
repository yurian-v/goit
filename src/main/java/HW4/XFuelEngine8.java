package HW4;

class Engine8 {
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
       }
    }
    class XFuelEngine extends Engine8{

        protected String serialNumber;

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }
        public String getFuelType() {
            return "XFuel";
        }

    public static void main(String[] args) {
        Engine8 basicEngine = new Engine8();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine8 xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}