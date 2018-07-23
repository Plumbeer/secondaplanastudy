import java.util.Scanner;

/**
 * @author Ashchepkov Vladislav
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner Digit = new Scanner(System.in);

        System.out.print("Введите первое слагаемое: ");
        //Считываем первое значение введённое пользователем в переменную "firstNum"
        double firstNum = Digit.nextDouble();

        System.out.print("Введите второе слагаемое: ");
        //Считываем второе значение введённое пользователем в переменную "secondNum"
        double secondNum = Digit.nextDouble();

        //Вычисляем сумму чисел и передаём её в переменную "total"
        double total;
        total = firstNum + secondNum;
        System.out.printf("Сумма: %.4f", total);

    }
}
