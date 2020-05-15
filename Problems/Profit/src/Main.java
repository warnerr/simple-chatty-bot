import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        int endAmount = scanner.nextInt();
        double percentage = 1 + (percent / 100);
        int years = 0;
        while (money < endAmount) {
            money = money * percentage;
            years++;
        }
        System.out.println(years);

    }
}