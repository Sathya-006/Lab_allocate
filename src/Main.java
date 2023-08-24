import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seating capacity of lab L1: ");
        int x = scanner.nextInt();

        System.out.print("Enter seating capacity of lab L2: ");
        int y = scanner.nextInt();

        System.out.print("Enter seating capacity of lab L3: ");
        int z = scanner.nextInt();

        System.out.print("Enter the number of students in the class: ");
        int n = scanner.nextInt();

        String allocatedLab = allocateLab(x, y, z, n);

        if (!allocatedLab.equals("No lab available")) {
            System.out.println("The suitable lab for the class is: " + allocatedLab);
        } else {
            System.out.println("No lab can accommodate the class.");
        }
    }

    public static String allocateLab(int x, int y, int z, int n) {
        if (x >= n) {
            return "L1";
        } else if (y >= n) {
            return "L2";
        } else if (z >= n) {
            return "L3";
        } else {
            return "No lab available";
        }
    }
}