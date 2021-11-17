package CalcLogic;

import CalcExceptions.WrongLineException;

public class InputLineLengthValidate {
    public static void validate(String [] arr) throws WrongLineException{
        if (arr.length !=3){
            throw new WrongLineException("Неправильное количество аргументов");
        }
    }

}
