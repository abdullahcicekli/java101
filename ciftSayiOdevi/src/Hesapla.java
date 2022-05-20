import java.util.Scanner;
public class Hesapla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = sc.nextInt();
        float toplam = 0;
        float sayac = 0;
        for (int i=1; i<=sayi; i++){
            if (i%3==0 && i%4==0){
                sayac = sayac + 1;
                toplam = toplam + i;
            }
        }

        float ortalama = toplam/sayac;

        System.out.printf("3 ve 4'e ortak bölünen sayıların ortalaması %.2f'dir",ortalama);
    }
}
