import CalcLogic.MainLogic;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        System.out.println(" Введите число, арифметическую операцию и другое число через пробел");
        System.out.println(" Числа в пределах от 1 до 10. Римские или Арабские");
        Scanner scanner = new Scanner(System.in);
        String math = scanner.nextLine();
        String[] mathArr = math.split(" ");
        MainLogic.execute(mathArr);

    }
}
