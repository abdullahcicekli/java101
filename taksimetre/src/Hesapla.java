import java.util.Scanner;

/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

public class Hesapla {
    public static void main(String[] args) {

        double kilometre;
        double kilometreBasinaTutar=2.20;
        double taksimetreAcilisTutar=10;
        double toplamTutar;

        Scanner sc=new Scanner(System.in);

        // Kilometre değeri al
        System.out.print("Mesafe Girin : ");
        kilometre=sc.nextDouble();

        //Toplam Tutar Hesapla
        toplamTutar=kilometreBasinaTutar*kilometre +taksimetreAcilisTutar;

        //Toplam Tutarı Kontrol Et
        toplamTutar=(toplamTutar<20) ? 20: toplamTutar;

        //Ekrana Yazdır
        System.out.println("| Gidilen Mesafe(km)      :| "+kilometre);
        System.out.println("| Taksimetre Açılış Ücreti:| "+taksimetreAcilisTutar);
        System.out.println("| Ödenecek Toplam Tutar   :| "+toplamTutar);
    }
}