package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_Listede_ElementlerinYeriniDegistirme {
    public static void main(String[] args) {

        //verilen bir listede istenen iki indexteki elementlerin yerini
        // kalici olarak degistiren bir metot olusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkindex = 2;
        int ikinciindex = 5;

        sayilar = swapElements(sayilar, ilkindex, ikinciindex);


    }

    private static List<Integer> swapElements(List<Integer> sayilar, int ilkindex, int ikinciindex) {

        //bir tam sayi olusturup,verilen indexlerdeki sayilari yer degistirin
        //indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin.
        List<Integer> sayi = new ArrayList<>();
        sayi.add(0, 6);
        sayi.add(1, 5);
        sayi.add(2, 7);
        sayi.add(3, 1);
        sayi.add(4, 6);
        sayi.add(5, 5);

        System.out.println(sayi);


        //int arr[]=  {1,3,5,3,5,6,1,7};
        //int arr2[]={{0,1}{1,2},{2,3},{3,4},{4,5},{5,6}};


        // for (int i=0; i<sayilar.size();i++) {


        return sayilar;


    }
}
