package HW4;

public class SpaceShip4 {
    private String serialNumber;
    public String getSerialNumber() {
        System.out.println(serialNumber.charAt(0));
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        System.out.println(serialNumber.charAt(0));
        if ((serialNumber.length() == 8) && (serialNumber.contains("S"))) {
            System.out.println(serialNumber.charAt(0));
            this.serialNumber = serialNumber;
        }
    }
        public static void main(String[] args) {
            SpaceShip4 ship = new SpaceShip4();
            ship.setSerialNumber("SN506788");
            System.out.println(ship.getSerialNumber()); //Should be SN506788
            ship.setSerialNumber("EEEEEEEE");
            System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
        }

    }

