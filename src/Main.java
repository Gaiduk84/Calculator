import java.util.Scanner;
public class Main {
    public static String calc(String input) {
        String[] tokens = input.trim().split(" ");
        if (tokens.length != 3) {
            System.out.println("throws Exception");
            throw new IllegalArgumentException("Введите два числа");
        }

        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            System.out.println("throws Exception");
            throw new IllegalArgumentException("Только арабские числа ");
        }
        if (a >= 11 || a <= 0||b >= 11 || b <= 0) {
            System.out.println("throws Exception");
            throw new IllegalArgumentException(" Числа должны быть от 1 до 10");
        }
        int result = 0;
        switch (tokens[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("throws Exception");
                throw new IllegalArgumentException("throws Exception");
        }

        return Integer.toString(result);
    }

    public static void main(String[] args) {
        System.out.println("Введите выражение через пробел");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);
    }
}
