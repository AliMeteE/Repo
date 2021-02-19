package chapter02;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double santigrat;
        System.out.println("Enter a degree in Celsius :");
        Scanner scan=new Scanner(System.in);
        santigrat=scan.nextDouble();

        double valueFahrenheit;
        valueFahrenheit=1.8*santigrat+32;

        System.out.println("Girilen Celsius: " + santigrat + " Fahrenheit karsiligi : " + valueFahrenheit);
    }
}
