import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        float mat,fizik,turkce,kimya,muzik;
        int sayac = 0;
        float toplam = 0;
        Scanner sc = new Scanner(System.in);

        //Matematik Notunu Al ve Kontrol Et
        System.out.print("Matematik Notunuzu girin : ");
        mat = sc.nextInt();
        if (mat >= 0 && mat <= 100){
            sayac++;
            toplam = toplam + mat;
        }

        //fizik Notunu Al ve Kontrol Et
        System.out.print("fizik Notunuzu girin : ");
        fizik = sc.nextInt();
        if (fizik >= 0 && fizik <= 100){
            sayac++;
            toplam = toplam + fizik;
        }

        //turkce Notunu Al ve Kontrol Et
        System.out.print("turkce Notunuzu girin : ");
        turkce = sc.nextInt();
        if (turkce >= 0 && turkce <= 100){
            sayac++;
            toplam = toplam + turkce;
        }

        //kimya Notunu Al ve Kontrol Et
        System.out.print("kimya Notunuzu girin : ");
        kimya = sc.nextInt();
        if (kimya >= 0 && kimya <= 100){
            sayac++;
            toplam = toplam + kimya;
        }

        //Müzik Notunu Al ve Kontrol Et
        System.out.print("Müzik Notunuzu girin : ");
        muzik = sc.nextInt();
        if (muzik >= 0 && muzik <= 100){
            sayac++;
            toplam = toplam + muzik;
        }

        float ortalama = toplam / sayac;

        if (ortalama < 55 ){
            System.out.printf("Notunuz %f", ortalama);
            System.out.print("\nKALDINIZ");
        }else {
            System.out.printf("Notunuz %f", ortalama);
            System.out.print("\nGEÇTİNİZ");
        }

    }
}
