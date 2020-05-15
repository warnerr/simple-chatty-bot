import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 1) {
            System.out.print(number + " ");
            boolean positive = number % 2 == 0;
            if (positive) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
        }
        System.out.print(number);
    }
}
