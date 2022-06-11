
    class ProfessorHelper {
        public boolean areNumbersCool(int number1, int number2){
            boolean arenumbersCool = number1 == number2;
            return true;
        }

        //Test output
        public static void main(String[] args) {
            ProfessorHelper helper = new ProfessorHelper();
            System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
        }
    }

