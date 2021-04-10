package HomeWork1;

import java.util.Arrays;

public class draft {

    public static void main(String[] args) {

int[] Nik = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(Nik));

        int n = Nik.length;
        for (int i : Nik) {
            if (n >= 0)
            System.out.print(Nik[n-1] + " ");
            n--;
        }

    }
}

