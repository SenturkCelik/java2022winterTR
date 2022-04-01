package workshop2;

import java.util.Scanner;

public class password_username {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int hataliGiris=0;

        do {
            System.out.println("Kullanici adi :");
            String username = scan.next();
            System.out.println("Sifrenizi girin :");
            String password = scan.next();

            if (password.equals("pwd123") && username.equals("admin")) {
                System.out.println("Giris basarili \n" + "***HosGeldiniz*** ");
                break;

            } else {
                System.out.println("hatali giris yaptiniz,Tekrar deneyiniz");
                hataliGiris++;
                System.out.println("kalan hakkiniz :" + (3 - hataliGiris));
            }
            if (hataliGiris == 3) {
                System.out.println("3 hatali giris yaptiniz hesabiniz bloke edildi!");
            }
        } while (hataliGiris<3);
        }
    }

