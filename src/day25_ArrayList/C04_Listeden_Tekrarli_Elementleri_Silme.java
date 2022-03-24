package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Listeden_Tekrarli_Elementleri_Silme {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar); // [1, 3, 5, 6, 7]
        System.out.println(sayilar); // [1, 3, 5, 3, 5, 6, 1, 7]




    }

    private static void tekrarsizListeOlustur(List<Integer> sayilar) {

        //1.adim yeni array list olustur.

        List<Integer> tekrarsizList=new ArrayList<>();
        for(int i=0; i<sayilar.size();i++){
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));

            }
        }
        System.out.println(tekrarsizList);

    }
}
