package workshop2;

import java.util.Arrays;
import java.util.Scanner;

public class String_arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = scan.nextLine();

        //split
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        // sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 0;

        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] +  " sayisi  "  + (counter+1));
                counter = 0;
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] +  " sayisi " + (counter+1));
            }
        }


    }}



