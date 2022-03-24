package Workshop;

public class mehmetHoca_pratik1 {
    public static void main(String[] args) {
// kullanicidan 4 harfli bir kelime isteyin,girilen kelimeyi ilk harfi buyuk digerleri kucuk ve tersten yazdirin

        String input="Mavi";
        String tersStr=input.substring(3).toUpperCase()+

                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
                 System.out.println(tersStr);



    }
}
