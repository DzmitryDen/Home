package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    long i = 0; // внутренний счетчик калькулятора

    /**
     метод увеличивающий внутренний счетчик
     * */
    public void incrementCountOperation() {
        i++;
    }

    /**
     метод возвращающий количество использований калькулятора
     * */
    public long getCountOperation() {
        return i;
    }
}
