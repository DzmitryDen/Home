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
        incrementCountOperation();
        return calcOp.division(a,b);
    }

    public double multiplicationOP(double a, double b){
        incrementCountOperation();
        return calcOp.multiplication(a,b);
    }

    public double subtractionOP(double a, double b){
        incrementCountOperation();
        return calcOp.subtraction(a,b);
    }

    public double additionOP(double a, double b){
        incrementCountOperation();
        return calcOp.addition(a,b);
    }

    public double exponentOP (double a, int b){
        incrementCountOperation();
        return calcOp.exponent(a,b);
    }

    public double modOP(double a) {
        incrementCountOperation();
        return calcOp.mod(a);
    }

    public double sqrOP(double a) {
        incrementCountOperation();
        return calcOp.sqr(a);
    }

    /**
     *  Делегируем калькулятору CalculatorWithMathCopy
     */
    public double divisionCop(double a, double b){
        incrementCountOperation();
        return calcCop.division(a,b);
    }

    public double multiplicationCop(double a, double b){
        incrementCountOperation();
        return calcCop.multiplication(a,b);
    }

    public double subtractionCop(double a, double b){
        incrementCountOperation();
        return calcCop.subtraction(a,b);
    }

    public double additionCop(double a, double b){
        incrementCountOperation();
        return calcCop.addition(a,b);
    }

    public double exponentCop (double a, int b){
        incrementCountOperation();
        return calcCop.exponent(a,b);
    }

    public double modCop(double a) {
        incrementCountOperation();
        return calcCop.mod(a);
    }

    public double sqrCop(double a) {
        incrementCountOperation();
        return calcCop.sqr(a);
    }

    /**
     *  Делегируем калькулятору CalculatorWithMathExtends
     */
    public double divisionEx(double a, double b){
        incrementCountOperation();
        return calcEx.division(a,b);
    }

    public double multiplicationEx(double a, double b){
        incrementCountOperation();
        return calcEx.multiplication(a,b);
    }

    public double subtractionEx(double a, double b){
        incrementCountOperation();
        return calcEx.subtraction(a,b);
    }

    public double additionEx(double a, double b){
        incrementCountOperation();
        return calcEx.addition(a,b);
    }

    public double exponentEx (double a, int b){
        incrementCountOperation();
        return calcEx.exponent(a,b);
    }

    public double modEx(double a) {
        incrementCountOperation();
        return calcEx.mod(a);
    }

    public double sqrEx(double a) {
        incrementCountOperation();
        return calcEx.sqr(a);
    }

    public long getCountOperation() {
        return this.i;
    }
}
