package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    /**
     * переменная - счетчик
     */
    private long i;

    /**
     * метод, увеличивающий счетчик на 1
     */
    public void incrementCountOperation() {
        this.i++;
    }

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
        incrementCountOperation();
        return res;
    }

    public double multiplicationOP(double a, double b){
        double res = calcOp.multiplication(a,b);
        incrementCountOperation();
        return res;
    }

    public double subtractionOP(double a, double b){
        double res = calcOp.subtraction(a,b);
        incrementCountOperation();
        return res;
    }

    public double additionOP(double a, double b){
        double res = calcOp.addition(a,b);
        incrementCountOperation();
        return res;
    }

    public double exponentOP (double a, int b){
        double res = calcOp.exponent(a,b);
        incrementCountOperation();
        return res;
    }

    public double modOP(double a) {
        double res = calcOp.mod(a);
        incrementCountOperation();
        return res;
    }

    public double sqrOP(double a) {
        double res = calcOp.sqr(a);
        incrementCountOperation();
        return res;
    }

    /**
     *  Делегируем калькулятору CalculatorWithMathCopy
     */
    public double divisionCop(double a, double b){
        double res = calcCop.division(a,b);
        incrementCountOperation();
        return res;
    }

    public double multiplicationCop(double a, double b){
        double res = calcCop.multiplication(a,b);
        incrementCountOperation();
        return res;
    }

    public double subtractionCop(double a, double b){
        double res = calcCop.subtraction(a,b);
        incrementCountOperation();
        return res;
    }

    public double additionCop(double a, double b){
        double res = calcCop.addition(a,b);
        incrementCountOperation();
        return res;
    }

    public double exponentCop (double a, int b){
        double res = calcCop.exponent(a,b);
        incrementCountOperation();
        return res;
    }

    public double modCop(double a) {
        double res = calcCop.mod(a);
        incrementCountOperation();
        return res;
    }

    public double sqrCop(double a) {
        double res = calcCop.sqr(a);
        incrementCountOperation();
        return res;
    }

    /**
     *  Делегируем калькулятору CalculatorWithMathExtends
     */
    public double divisionEx(double a, double b){
        double res = calcEx.division(a,b);
        incrementCountOperation();
        return res;
    }

    public double multiplicationEx(double a, double b){
        double res = calcEx.multiplication(a,b);
        incrementCountOperation();
        return res;
    }

    public double subtractionEx(double a, double b){
        double res = calcEx.subtraction(a,b);
        incrementCountOperation();
        return res;
    }

    public double additionEx(double a, double b){
        double res = calcEx.addition(a,b);
        incrementCountOperation();
        return res;
    }

    public double exponentEx (double a, int b){
        double res = calcEx.exponent(a,b);
        incrementCountOperation();
        return res;
    }

    public double modEx(double a) {
        double res = calcEx.mod(a);
        incrementCountOperation();
        return res;
    }

    public double sqrEx(double a) {
        double res = calcEx.sqr(a);
        incrementCountOperation();
        return res;
    }

    public long getCountOperation() {
        return this.i;
    }
}
