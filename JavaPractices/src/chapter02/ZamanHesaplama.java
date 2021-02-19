package chapter02;

import java.util.Scanner;

public class ZamanHesaplama {
    public static void main(String[] args) {
        int saat;
        int dakika;
        int saniye;
        int girilenSaniye;
        System.out.println("Lutfen hesaplanmasını istediginiz saniyeyi giriniz");
        Scanner scan = new Scanner(System.in);
        girilenSaniye = scan.nextInt();

            saat = girilenSaniye / 3600;
            dakika = (girilenSaniye % 3600) / 60;
            saniye = girilenSaniye % 60;

        System.out.println(saat+":saat " + dakika +": dakika" + saniye +": saniye");

    }
}
