package HW6;
import java.util.*;
public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String surname = scanner.nextLine();
    int age = scanner.nextInt();
    scanner.close();

    System.out.println(name + " " + surname + " " + age*10);
    System.out.println(name.toUpperCase() + "\n" + surname.toUpperCase() + "\n" + age*10);
    }

    public static void main(String[] args) {
        PassportFormCreator test = new PassportFormCreator();
    test.createForms();
    }
}