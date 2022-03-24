package day22_Arrays_sort;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {


        int arr[]={21,5,33,8,11,0,54,66,34};
        int istenenSayi=54;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));

    }
}
