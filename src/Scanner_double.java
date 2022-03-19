import java.util.Scanner;

public class Scanner_double {
    public static void main(String[] args) {
        System.out.print("Введите любое дробное число: ");
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        System.out.println("Вы ввели число: " + number1);
    }
}
