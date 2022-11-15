import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите первое число: ");
        int second = scanner.nextInt();
        System.out.print("Введите символ операции +, -, * или /: ");
        //String symbol = scanner.next();
        char symbol = scanner.next().charAt(0);
        switch (symbol){
            case '+': System.out.println(first+second);
            break;
            case '-': System.out.println(first-second);
            break;
            case '*': System.out.println(first*second);
            break;
            case '/': System.out.println(first/second);
            break;
        }
    }
}