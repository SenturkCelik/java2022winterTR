package day30_passByValue;

public class C02_StaticBlock {

    {
        System.out.println("static olmayan block calisti");
    }
    static {
        System.out.println("static blok calisti");
    }
    public static void main(String[] args) {
        System.out.println("main metot calisti");
    }
    C02_StaticBlock obj1=new C02_StaticBlock();
    C02_StaticBlock obj2=new C02_StaticBlock();

    
}
