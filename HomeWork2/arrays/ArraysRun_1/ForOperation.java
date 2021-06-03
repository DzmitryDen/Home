package HomeWork2.arrays.ArraysRun_1;

public class ForOperation implements IArraysOperation{

    @Override
    public void printAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void printAllSecond(int[] arr) {
        for (int i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void printAllRevers(int[] arr) {
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
