package CalcLogic;
import CalcExceptions.WrongLineException;

// проверяем, можно ли запарсить инты, и входят ли они в диапазон
public class ArabianCheck {
    public static int process(String[] arr) throws WrongLineException {
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[2]);
        if ((x < 1 || x > 10) || (y < 1 || y > 10)) {
            throw new WrongLineException("Числа вне допустимых значений");
        }
        return Calculate.operation(x, y, arr[1]);}
    }




