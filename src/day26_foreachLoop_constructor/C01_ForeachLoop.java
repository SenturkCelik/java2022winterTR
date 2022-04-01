package day26_foreachLoop_constructor;

public class C01_ForeachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        for (int i=0; i<arr.length ; i++){
        //    System.out.print(arr[i] + "");
        }
        System.out.println(" ");

        // for each loop'u calistirmak icin hedef bir collection vermeliyiz

        for(int each : arr){
            System.out.print(each +" ");    // avantaji: index baslangic degeri bitis degeri gibi detaylarla ugrasmamiza
                                              //gerek kalmadan collection dan tum elementleri bize getirir

                                            // dezavantaji: indexe bagli bir islem yapamayiz


        }



    }
}
