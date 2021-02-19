package chapter02;

import java.sql.Date;

public class SuankiZamaniGoster {
    private static Object Date;

    public static void main(String[] args) {
        double toplamMiliSaniye=System.currentTimeMillis();

        double toplamSaniye = toplamMiliSaniye/1000;
        System.out.println("Toplam Saniye : " + toplamSaniye);
        double currentSeconds= toplamSaniye%60;
        System.out.println("Simdiki Saniye :" + currentSeconds);
        double toplamDakika=toplamSaniye/60;
        double toplamSaat=toplamSaniye/3600;
        double currentMinutes = (toplamSaniye%3600)/60;
        System.out.println("Simdiki Dakika :" + (int)currentMinutes);
        double currentHours=(toplamSaniye/3600)%24;
        System.out.println("Simdiki Saat " + currentHours); // Greenwich'e gore 3 saat geri



    }
}
