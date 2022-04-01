package day29_StaticKeyword;

class C02_StaticKeyword {

    public static void main(String[] args) {

  // baska class taki static class uyelerine ulasabilmek icin sadece
        //classIsmi.staticUyeIsmi  yazmamizyeterlidir

        System.out.println(C01Static.okultelefonu);
        C01Static.okultelefonu="3124324343";

        System.out.println(C01Static.okultelefonu);


    }
}
