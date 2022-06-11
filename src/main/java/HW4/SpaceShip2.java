package HW4;

public class SpaceShip2 {
    private String name;
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
        public static void main (String[]args){
            SpaceShip2 ship = new SpaceShip2();
            System.out.println(ship.getName());
            ship.setName("Walker");
            System.out.println(ship.getName());
        }
    }

