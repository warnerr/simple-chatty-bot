import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        boolean result = false;

        firstString = firstString.replaceAll("\\s+", "");
        secondString = secondString.replaceAll("\\s+", "");
        if (firstString.trim().equals(secondString.trim())) {
            result = true;
        }
        System.out.println(result);
    }
}