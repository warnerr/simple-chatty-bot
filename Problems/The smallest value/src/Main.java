import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int factorial = 2;
        long factorialValue = 2;
        while (factorialValue <= number) {
            factorial++;
            factorialValue = factorialValue * factorial;
        }

        System.out.println(factorial);
    }
}