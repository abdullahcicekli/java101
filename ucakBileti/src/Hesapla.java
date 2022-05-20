import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float kmTutar = 0.10f ;

        System.out.print("Km Girin : ");
        float kilometre = sc.nextFloat();

        System.out.print("Yaş Girin : ");
        float yas = sc.nextFloat();

        System.out.println("Yolculuk Tipi Seçin : ");
        System.out.println("1-Tek Gidiş\n2-Gidiş / Dönüş");
        int tip = sc.nextInt();

        if (yas > 0 && kilometre > 0 && (tip == 1 | tip == 2)){
            float tutar = kilometre*kmTutar;
            System.out.printf("\nNormal Tutar : %.2f ₺",tutar);
            if (yas < 12){
                tutar = tutar / 2;
                System.out.printf("\nÇocuk İndirimi Tutarı : %.2f ₺",tutar);
            }else if (yas >= 12 && yas <=24){
                tutar = tutar - (tutar/10);
                System.out.printf("\nGenç Yaş İndirimi Tutarı : %.2f ₺",tutar);
            }else if (yas > 65){
                tutar = tutar - ((tutar/30)/100);
                System.out.printf("\n65 Yaş Üstü İndirimi Tutarı : %.2f ₺",tutar);
            }
            if (tip == 2){
                tutar = (tutar-(tutar/5))*2;
                System.out.printf("\nGidiş Geliş İndirimi Tutarı : %.2f ₺",tutar);
            }
        }else{
            System.out.print("Hatalı Değer Girdiniz.");
        }

    }
}
