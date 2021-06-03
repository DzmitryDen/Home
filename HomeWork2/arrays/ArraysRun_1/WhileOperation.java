package HomeWork2.arrays.ArraysRun_1;

public class WhileOperation implements IArraysOperation{

    @Override
    public void printAll(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    @Override
    public void printAllSecond(int[] arr) {
        int j = 1;
        while (j < arr.length) {
            System.out.print(arr[j] + " ");
            j += 2;
        }
    }

    @Override
    public void printAllRevers(int[] arr) {
        int k = arr.length-1;
        while (k >= 0 ) {
            System.out.print(arr[k] + " ");
            k --;
        }
    }
}
