package HomeWork2.arrays.ArraysRun_1;

public class ForEachOperation implements IArraysOperation{

    @Override
    public void printAll(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    @Override
    public void printAllSecond(int[] arr) {
        int k = 1;
        for (int i : arr) {
            if (k < arr.length) {
                System.out.print(arr[k] + " ");
                k += 2;
            }
        }
    }

    @Override
    public void printAllRevers(int[] arr) {
        int l = arr.length;
        for (int i : arr) {
            if (l >= 0) {
                System.out.print(arr[l-1] + " ");
                l --;
            }
        }
    }
}
