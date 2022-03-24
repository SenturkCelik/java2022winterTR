package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

import static day25_ArrayList.C02_Array.istenmeyenElementiSil;

public class C03_Listten_Istenmeyen_Elementleri_Silme {
    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=4;

        istenmeyenElementiSil(arr,istenmeyenEleman);     // 1.istenmeyen elementleri say 2. yeni array olustur
        // 3.eski array den uygun elementleri yeniye tasi
        // 4.yazdir


    List<Integer> yeniList=new ArrayList<>();

    for (int i=0; i<arr.length;i++){
        if(arr[i]!=istenmeyenEleman){
            yeniList.add(arr[i]);
        }
    }


        System.out.println(yeniList);
    }
}
