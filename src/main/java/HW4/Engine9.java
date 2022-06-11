package HW4;

class AdvancedXFuelEngine extends XFuelEngine {
    @Override
    public void setPower(int power) {
        this.power = power;
    }

    private int power;

    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + power);
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}





