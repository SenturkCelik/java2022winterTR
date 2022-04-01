package day26_foreachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForeachLoop {
    public static void main(String[] args) {

        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
               // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String array1[]={"Ali","Ayse","Can","Fatma"};
        String array2[]={"Can","Evren","Fatma","Emre"};

        List<String> ortakelemanlar=new ArrayList<>();
        for (String each1: array1){

        for (String each2: array1){
            if (each1.equals(each2)){
                ortakelemanlar.add(each1);

            }
        }

        }
        if (ortakelemanlar.isEmpty()){

            System.out.println("Ortak eleman yok");
        } else {
            System.out.println("İki array'deki ortak elemanlar : " + ortakelemanlar);
        }
    }
}