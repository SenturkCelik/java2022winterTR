package day18_NestedForLoop;

public class C02_forloop {
    public static void main(String[] args) {

        int input=9;
        int faktoriyel=1;
        String faktoriyelAcikYazim="";

        for( int i=input; i>=1;  i--){

            faktoriyel  *= i;
            faktoriyelAcikYazim =faktoriyelAcikYazim +"*" +i ;


        }

        System.out.println(input+"!=" + faktoriyelAcikYazim +" =" +faktoriyel);
    }
}
