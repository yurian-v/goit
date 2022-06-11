package HW3;

import java.util.*;

public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String fName = scanner.nextLine();
        System.out.println("");
        String lName = scanner.nextLine();
        System.out.println("");
        int age = scanner.nextInt();
        int moonAge = age * 10;
        System.out.println(fName + " " + lName + " " + moonAge);
        System.out.println(fName.toUpperCase());
        System.out.println(lName.toUpperCase());
        System.out.println(moonAge);
        scanner.close();
    }
}