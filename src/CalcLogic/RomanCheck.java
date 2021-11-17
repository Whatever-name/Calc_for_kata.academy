package CalcLogic;

import CalcExceptions.WrongLineException;
import Convertation.IntegerToRoman;
import Convertation.RomanToInteger;

import java.util.HashSet;
import java.util.Set;

public class RomanCheck {


    public static String process(String[] arr) throws WrongLineException {
        Set<String> values = new HashSet<>();
        values.add("I");
        values.add("II");
        values.add("III");
        values.add("IV");
        values.add("V");
        values.add("VI");
        values.add("VII");
        values.add("VIII");
        values.add("IX");
        values.add("X");

        if (values.contains(arr[0]) && values.contains(arr[2])) { // Действительно ли переданы Римские числа от 1 до 10. Грубо, конечно...
            int x = RomanToInteger.convert(arr[0]);
            int y = RomanToInteger.convert(arr[2]);
            int midresult = Calculate.operation(x, y, arr[1]); // передаем численные значения для операций над ними
            if (midresult <= 0) {
                throw new WrongLineException("Ошибка, не могу отобразить римское число меньше ноля");
            }
            String result = IntegerToRoman.convert(midresult); // Получаем римское число из арабского обратно, согласно техзаданию
            return result;
        } else throw new WrongLineException("Данные не корректны");

    }
}