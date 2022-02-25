package ss8_clean_code.thuc_hanh.Calculator;

public class Calculator {
    public static int calculate(int firstOperand , int secondOperand , char operator ) {
        switch (operator ) {
            case '+':
                return firstOperand  + secondOperand ;
            case '-':


            case '*':

                return firstOperand  * secondOperand ;
            case '/':
                if (secondOperand  != 0)
                    return firstOperand  / secondOperand ;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
