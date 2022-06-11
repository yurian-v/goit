package HW4;

    public class SpaceShip3 {
        private String name;
        public String getName() {
            return name;
        }
        private void setName(String name) {
            if (name != null && !name.isBlank() && name.length() < 100) {
                this.name = name;
            }
        }
        public static void main(String[] args) {
            SpaceShip3 ship = new SpaceShip3();
            ship.setName("Walker");
            System.out.println(ship.getName()); //Should be Walker

            ship.setName("");
            System.out.println(ship.getName()); //Should be Walker, empty value ignored

            ship.setName("Voyager ".repeat(100));
            System.out.println(ship.getName()); //Should be Walker, too long value ignored
        }
    }