package day21__arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"ali", "veli", "ayse"};
        // array icindeki elementlere ulasmak icin index kullaniriz

        System.out.println(arr1[0]);
        arr1[1]="esila";
        System.out.println(arr1[1]);
        //arrayin icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz.

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);  //0
        //System.out.println(arr2[5]);// out of bounds for length 4

        // arrayin tamamini yazdirmak icin

        //System.out.println(arr2); // array ler non primitive oldugundan direkt yazdirmak istersek
                                    // java referans bilgisini yazdirir.
        for(int i=0; i<4; i++){
            System.out.print(arr2[i]+" ");   // array i yazdirmak icin javadaki arrays classindaki to String() kullanilir
            System.out.println("");
            System.out.println(Arrays.toString(arr2));

            arr2[1]=11;
            arr2[3]=22;
            System.out.println(Arrays.toString(arr2));

            System.out.println(Arrays.toString(arr1));
        }

    }
}
