package day30_passByValue;

import java.util.Arrays;

public class C06_passByValue {

    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("metot call sonrasi: " + Arrays.toString(arr));



    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[2]=6;
        System.out.println(Arrays.toString(arr));

    }
}
