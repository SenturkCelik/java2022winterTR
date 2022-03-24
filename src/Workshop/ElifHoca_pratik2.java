package Workshop;

public class ElifHoca_pratik2 {


    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz

    */
    public static void main(String[] args) {

        char finalNotu='D';
        
        String result="";
        
        result=(finalNotu=='A')?"Gayet basarili":
               (finalNotu== 'B')?"Basarili":
        (finalNotu=='C')?"Ha gayret" : "Digerleri..";
        System.out.println("result = " + result);
        

        

    }



}


