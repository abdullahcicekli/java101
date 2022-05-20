import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sayi1;
        int sayi2;
        int islem;
        // Sayı değeri al
        System.out.print("İlk Sayıyı Giriniz : ");
        sayi1=sc.nextInt();
        System.out.print("İlk Sayıyı Giriniz : ");
        sayi2=sc.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapılacak işlemi Seçiniz : ");
        islem=sc.nextInt();

        switch (islem){
            case 1:
                System.out.printf("İşleminizin sonucu : %d",(sayi1+sayi2));
                break;
            case 2:
                System.out.printf("İşleminizin sonucu : %d",(sayi1-sayi2));
                break;
            case 3:
                System.out.printf("İşleminizin sonucu : %d",(sayi1*sayi2));
                break;
            case 4:
                System.out.printf("İşleminizin sonucu : %d",(sayi1/sayi2));
                break;
        }
    }
}
