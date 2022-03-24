package day22_Arrays_sort;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {

    public static void main(String[] args) {

        //verilen bir arrayi buyukten kucuge siralayip yazdiran bir methot olustur

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arr);

    }

    private static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr);
        int tersArr[]=new int[arr.length]; //
        System.out.println(Arrays.toString(arr));  //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.toString(tersArr));  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i= 0; i<arr.length ; i++){
            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));



    }


}
