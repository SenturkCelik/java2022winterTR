package day28Constructor;

public class C01StatickKeyWords {


static int sayi1=1;
int sayi2;

public static void main(String[] args) {

    System.out.println("sayi1:"+sayi1);

    StatickKeyWords obj1= new StatickKeyWords();

    System.out.println(obj1.sayi2);

    StatickKeyWords obj2= new StatickKeyWords();

    System.out.println(obj2.sayi2);
    System.out.println(obj2.sayi1);
obj2.sayi2++;
obj2.sayi2++;

}





















}
