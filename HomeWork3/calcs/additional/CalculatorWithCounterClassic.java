package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

   private long i; // внутренний счетчик калькулятора

    /**
     метод увеличивающий внутренний счетчик
     * */
    public void incrementCountOperation() {
        this.i++;
    }

    /**
     метод возвращающий количество использований калькулятора
     * */
    public long getCountOperation() {
        return this.i;
    }
}
