package HW4;

import javax.lang.model.element.Name;

public class SpaceShip5 {

    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
            System.out.println(name);
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        if (serialNumber != null && !serialNumber.isBlank()) {
            this.serialNumber = serialNumber;
            System.out.println(serialNumber);
        }
    }
    public void printInfo(){
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
        return;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip5 ship = new SpaceShip5();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
