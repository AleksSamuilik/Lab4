import java.util.Scanner;

public class SimplicityCheck {

    public static int toPrint() {
        System.out.println("This program performs checks the number for simplicity.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number greater than 0: ");
        String string = scanner.nextLine();

        try {

            int xxx = Integer.parseInt(string);
            if (xxx > 0) {
                return xxx;
            } else
                System.out.println("Sorry. Restart the program and try again!");
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("Sorry. Restart the program and try again!");
            System.exit(0);
        }
        scanner.close();
        return 0;
    }

    public static void checkCase(int n) {
        int i = 2;
        int j = 0;
        while (i * i <= n && j != 1) {
            if (n % i == 0) {
                j = 1;
                i += 1;
            } else {
                i += 1;
            }
        }
        if (j == 1) {
            System.out.println("Number: " + n + " compound.");
        } else {
            System.out.println("Number: " + n + " simplicity.");
        }
    }

    public static void main(String[] args) {
        int xxx = toPrint();
        checkCase(xxx);
    }
}
