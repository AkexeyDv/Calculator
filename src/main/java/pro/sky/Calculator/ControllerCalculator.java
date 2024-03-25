package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculator {
    private final CalculatorInterface calculator;
    public ControllerCalculator(Calculator calculator){
        this.calculator=calculator;
    }
    @GetMapping(path="/calculator")
    public String hello(){
        return calculator.hello();
    }
    @GetMapping(path="/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return String.valueOf((calculator.plus(num1,num2)));
    }
    @GetMapping(path="/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return String.valueOf((calculator.minus(num1,num2)));
    }
    @GetMapping(path="/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return String.valueOf((calculator.multiply(num1,num2)));
    }
    @GetMapping(path="/calculator/divide")

    public String divide(@RequestParam(required = false) String num1,  @RequestParam(required = false) String num2){
        return String.valueOf((calculator.divide(num1,num2)));
    }


}
