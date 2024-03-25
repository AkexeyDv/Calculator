package pro.sky.Calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Calculator implements CalculatorInterface {

    public String hello() {
        return "Привет! С вами платформа Калькулятор";
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public String divide(String num1, String num2) {
        if (!validNum(num1, num2)) {
            return "Неверное количество аргументов";
        }
        if (Integer.valueOf(num2) == 0) {
            return "Деление на ноль";
        }

        return String.valueOf(Float.valueOf(num1) / Float.valueOf(num2));
    }

    private boolean validNum(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return false;
        }
        return true;
    }
}
