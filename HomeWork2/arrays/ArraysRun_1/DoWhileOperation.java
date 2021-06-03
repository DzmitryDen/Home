package HomeWork2.arrays.ArraysRun_1;

public class DoWhileOperation implements IArraysOperation{
    @Override
    public void printAll(int[] arr) {
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        }
        while (i < arr.length) ;
    }

    @Override
    public void printAllSecond(int[] arr) {
        int j = 1;
        do {
            System.out.print(arr[j] + " ");
            j += 2;
        }
        while (j < arr.length) ;
    }

    @Override
    public void printAllRevers(int[] arr) {
        int k = arr.length-1;
        do {
            System.out.print(arr[k] + " ");
            k--;
        }
        while (k >= 0) ;
    }
}
