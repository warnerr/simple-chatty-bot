import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] values = numbers.split(" ");
        int begin = Integer.parseInt(values[0]);
        int end = Integer.parseInt(values[1]);
        System.out.println(input.substring(begin, end + 1));
    }
}