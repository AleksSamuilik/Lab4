import java.util.Scanner;

public class SimplicityCheck {

    public static int readUserInput() {
        System.out.println("This program performs simplicity check for the given number.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number greater than 0: ");
        boolean checkInput=true;
        while (checkInput) {
            String string = scanner.nextLine();
            try {
                int xxx = Integer.parseInt(string);
                if (xxx > 0) {
                    return xxx;
                } else
                    System.out.println("Sorry. Try again!");
            } catch (NumberFormatException e) {
                System.out.println("Sorry. Try again!");
            }
        }
        scanner.close();
        return -1;
    }

    public static boolean isSimple(int n) {
        int i = 2;
        while (i * i <= n ) {
            if (n % i == 0) {
                return false;
            }
            i += 1;
        }
            return true;
        }

    public static void main(String[] args) {
        int xxx = readUserInput();
        if (isSimple(xxx)){
            System.out.println("Number: " + xxx + " simplicity.");
        }else {
            System.out.println("Number: " + xxx + " compound.");
        }
    }
}