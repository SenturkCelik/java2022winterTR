package day26_foreachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForeachLoop {
    public static void main(String[] args) {

        // 10 elementli bir liste olustur

        int arr[]={2,5,4,6,7,3,11,22,12,15};

        List<Integer> sayilar =new ArrayList<>();

        for (int each :arr){
            sayilar.add(each);
        }
        System.out.println(sayilar);

        // sayilar listesinde 3 e bolunemeyen sayilari for each loop ile yazdiralim

        for(int each : sayilar){
            if (each%3 !=0){
                System.out.print(each+" ");
            }
        }




    }
}
