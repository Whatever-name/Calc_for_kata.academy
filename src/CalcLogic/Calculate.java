package CalcLogic;

import Ariphmetic_operations.*;
import CalcExceptions.WrongLineException;

// непосредственно операции, исходя из того, какой знак был передан в arr[1]
public class Calculate {
    public static int operation(int x, int y, String action) throws WrongLineException {
        switch (action) {
            case "+" -> {
               Ariphmetic ariphmetic = new Summary();
                return ariphmetic.calculation(x, y);
            }
            case "-" -> {
                Ariphmetic ariphmetic = new Substraction();
                return ariphmetic.calculation(x, y);
            }
            case "*" -> {
                Ariphmetic ariphmetic = new Multiplication();
                return ariphmetic.calculation(x, y);
            }
            case "/" -> {
                Ariphmetic ariphmetic = new Division();
                return ariphmetic.calculation(x, y);
            }
            default -> throw new WrongLineException("неправильное математическое действие");
        }
    }
}
