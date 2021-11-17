package CalcLogic;

import CalcExceptions.WrongLineException;

public class MainLogic {
    public static void execute(String[] userInput) {
        try {
            InputLineLengthValidate.validate(userInput); // Проверка того, что выражение состоит из 2 чисел и знака, то есть arr.length=3
        } catch (
                WrongLineException e) {
            e.printStackTrace();
            System.exit(0);
        }
        try {
            int result = ArabianCheck.process(userInput); // Пытаемся получить инты из массива стрингов
            System.out.println(result);
        } catch (NumberFormatException e) {
            try {
                String result = RomanCheck.process(userInput);// Если ловим эксепшн при парсинге - проверяем, возможно это римские числа
                System.out.println(result);
            } catch (WrongLineException wrongLineException) {
                wrongLineException.printStackTrace();
                System.exit(0);
            }
        } catch (WrongLineException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
