package Workshop;

public class for_dongusu {
    public static void main(String[] args) {

          for (int i=99; i>=1; i--) {  // 1.yol:  100 den 1 e kadar olan tek sayilari yazdirma kodu
              System.out.println("" + i);
          }
 

          for (int i=1; i<50; i++){
         //System.out.println("+ (100-(2*i+1")));  //ikinci yol: tek sayilari listelemek icin bu yontemde  kullanilir

          }
          for (int i=1; i<100; i*=2) {  //  2 4 8 16 32 64, 2 nin uslerini yazdirma formulu
              System.out.println("" + i);
          }

          for (int i=1; i<100; i++) {

              if (i % 3 == 0 && i % 7 == 0)     //  0 ile 100 arasinda hem 3 e hemde 7 ye bolunebilen sayilari bul

                  System.out.println("" + i);



              //for (int i = 1; i <= 5; i++) {  //1 den 5 e tam bolunebilen sayilar
                  if (i % 5 == 0) {
                      System.out.println(i);

                     // for (int i = 100; i >= 1; i--) {
                          System.out.println(i);
                      }
                      System.out.println("**************");

                     // for (int i = 0; i < 50; i++)
                          System.out.println("" + (100 - (2 * i + 1)));




                  }


              }


          }
