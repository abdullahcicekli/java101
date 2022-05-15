import java.util.Scanner;

/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

public class Hesapla {
    public static void main(String[] args) {
        int fiyat;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Fiyat Girin : ");
        fiyat = sc.nextInt();

        boolean buyukmu = fiyat <= 1000;
        double kdv = buyukmu ? 0.18 : 0.08 ;
        double sonFiyat = fiyat + (fiyat * kdv);

        System.out.printf("Fiyat : %d\nKDV : %.2f \nKDV'li Fiyat: %.2f ",fiyat, kdv,sonFiyat);
    }
}
