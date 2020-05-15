import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int next = -1;
        int largest = 0;
        while (next != 0) {
            int number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
            next = number;
        }
        System.out.println(largest);
    }
}