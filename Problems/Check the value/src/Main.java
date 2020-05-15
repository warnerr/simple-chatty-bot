import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean isLessThanTen = false;
        int number = scanner.nextInt();
        if (number < 10) {
            isLessThanTen = true;
        }
        System.out.println(isLessThanTen);
    }
}