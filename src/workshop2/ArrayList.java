package workshop2;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        List<Integer> newList = new java.util.ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            newList.add(arr1[i]);

        }
        for (int i=0;i<arr2.length;i++){
         newList.add(arr2[i]);

}
        System.out.println(newList);
    }
}
