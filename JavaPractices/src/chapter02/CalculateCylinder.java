package chapter02;

import java.util.Scanner;

public class CalculateCylinder {
    public static void main(String[] args) {

        final double PI=3.14159;


        Scanner scan =new Scanner(System.in);


        System.out.println("Lutfen yaricap ve yukseklik bilgisini giriniz" );
        double  r=scan.nextDouble();
        double h= scan.nextDouble();
        double alan=r*r*PI;
        double hacim=alan*h;
        System.out.println("The area of Cylinder is : " + alan);
        System.out.println("The Volume of Cylinder is :" + hacim);
    }
}
