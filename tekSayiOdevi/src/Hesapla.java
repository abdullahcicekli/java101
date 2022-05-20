import java.util.Scanner;
public class Hesapla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        do {
            System.out.print("Sayı Giriniz : ");
            sayi = sc.nextInt();
            if (sayi%4==0){
                toplam = toplam + sayi;
            }
        }while (sayi%2==0);

        System.out.printf("Girilen sayılardan 4'ün katı olanalarının toplamı : %d",toplam);
    }
}
