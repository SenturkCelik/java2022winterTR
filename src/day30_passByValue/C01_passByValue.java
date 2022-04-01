package day30_passByValue;

public class C01_passByValue {
    public static class C01_staticBloks {
        static{
            System.out.println("static blok calisti");
        }
    C01_staticBloks(){
        System.out.println("Constructor calisti");

        }
    public static void main(String[] args) {
        System.out.println("main metot baslangici");
        C01_staticBloks obj1;
        new C01_staticBloks();

    }
    }
}
