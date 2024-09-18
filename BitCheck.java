import java.util.*;

public class BitCheck {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.print("Enter the bit position : ");
        int n = scan.nextInt();

        boolean Bit = (num & (1 << n)) != 0;

        if (Bit) {
            System.out.println("The " + n + "th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
        }

    }
}
