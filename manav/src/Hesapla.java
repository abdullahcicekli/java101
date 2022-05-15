import java.util.Scanner;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

public class Hesapla {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        System.out.printf("Armut kaç kilo ? : ");
        int armutkilo = sc.nextInt();
        System.out.printf("Elma kaç kilo ? : ");
        int elmakilo = sc.nextInt();
        System.out.printf("Domates kaç kilo ? : ");
        int domateskilo = sc.nextInt();
        System.out.printf("Muz kaç kilo ? : ");
        int muzkilo = sc.nextInt();
        System.out.printf("Patlıcan kaç kilo ? : ");
        int patlicankilo = sc.nextInt();

        double toplam = (armut*armutkilo)+(muz*muzkilo)+(elma*elmakilo)+(domates*domateskilo)+(patlican*patlicankilo);

        System.out.printf("Toplam Tutar : %.2f", toplam);

    }
}