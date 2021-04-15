package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private long i = 0; // внутренний счетчик калькулятора

    /**
     * Объявляем поля классов, которым делегируем
     */
    private CalculatorWithOperator calcOp;
    private CalculatorWithMathCopy calcCop;
    private CalculatorWithMathExtends calcEx;


    /**
     *  Конструктор, принимающий объект типа CalculatorWithOperator
     */
    public CalculatorWithCounterAutoComposite (CalculatorWithOperator calculator) {
        this.calcOp = calculator;
    }

    /**
     *  Конструктор, принимающий объект типа CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy calculator) {
        this.calcCop = calculator;
    }

    /**
     *  Конструктор, принимающий объект типа CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends calculator) {
        this.calcEx = calculator;
    }

    /**
     *  Делегируем калькулятору CalculatorWithOperator
     */
    public double divisionOP(double a, double b){
        double res = calcOp.division(a,b);
        i++;
        return res;
    }

    public double multiplicationOP(double a, double b){
        double res = calcOp.multiplication(a,b);
        i++;
        return res;
    }

    public double subtractionOP(double a, double b){
        double res = calcOp.subtraction(a,b);
        i++;
        return res;
    }

    public double additionOP(double a, double b){
        double res = calcOp.addition(a,b);
        i++;
        return res;
    }

    public double exponentOP (double a, int b){
        double res = calcOp.exponent(a,b);
        i++;
        return res;
    }

    public double modOP(double a) {
        double res = calcOp.mod(a);
        i++;
        return res;
    }

    public double sqrOP(double a) {
        double res = calcOp.sqr(a);
        i++;
        return res;
    }

    /**
     *  Делегируем калькулятору CalculatorWithMathCopy
     */
    public double divisionCop(double a, double b){
        double res = calcCop.division(a,b);
        i++;
        return res;
    }

    public double multiplicationCop(double a, double b){
        double res = calcCop.multiplication(a,b);
        i++;
        return res;
    }

    public double subtractionCop(double a, double b){
        double res = calcCop.subtraction(a,b);
        i++;
        return res;
    }

    public double additionCop(double a, double b){
        double res = calcCop.addition(a,b);
        i++;
        return res;
    }

    public double exponentCop (double a, int b){
        double res = calcCop.exponent(a,b);
        i++;
        return res;
    }

    public double modCop(double a) {
        double res = calcCop.mod(a);
        i++;
        return res;
    }

    public double sqrCop(double a) {
        double res = calcCop.sqr(a);
        i++;
        return res;
    }

    /**
     *  Делегируем калькулятору CalculatorWithMathExtends
     */
    public double divisionEx(double a, double b){
        double res = calcEx.division(a,b);
        i++;
        return res;
    }

    public double multiplicationEx(double a, double b){
        double res = calcEx.multiplication(a,b);
        i++;
        return res;
    }

    public double subtractionEx(double a, double b){
        double res = calcEx.subtraction(a,b);
        i++;
        return res;
    }

    public double additionEx(double a, double b){
        double res = calcEx.addition(a,b);
        i++;
        return res;
    }

    public double exponentEx (double a, int b){
        double res = calcEx.exponent(a,b);
        i++;
        return res;
    }

    public double modEx(double a) {
        double res = calcEx.mod(a);
        i++;
        return res;
    }

    public double sqrEx(double a) {
        double res = calcEx.sqr(a);
        i++;
        return res;
    }

    public long getCountOperation() {
        return i;
    }
}
