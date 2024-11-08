public class StrongNumber {
    public static void main(String[] args) {
        int num1 = 145;  //case 1: number is a strong number
        int num2 = 245;  //case 2: number is not a strong number
        Checker.strongNumberCheck(num1);
        Checker.strongNumberCheck(num2);
    }
}

class Checker {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void strongNumberCheck(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += calculateFactorial(digit);
            num /= 10;
        }

        if (sumOfFactorials == originalNum) {
            System.out.println(originalNum + " is a strong number. ");
        } else {
            System.out.println(originalNum + " is not a strong number.");
        }
    }
}

