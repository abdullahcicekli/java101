import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("1. Sayıyı Giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.printf("2. Sayıyı Giriniz : ");
        int sayi2 = sc.nextInt();
        System.out.printf("3. Sayıyı Giriniz : ");
        int sayi3 = sc.nextInt();

        if (sayi1>sayi2 && sayi1 > sayi3){
            if (sayi2 > sayi3){
                System.out.printf("%d>%d>%d",sayi1,sayi2,sayi3);
            }
            else {
                System.out.printf("%d>%d>%d",sayi1,sayi3,sayi2);
            }
        }else if (sayi2>sayi1 && sayi2 > sayi3){
            if (sayi1 > sayi3){
                System.out.printf("%d>%d>%d",sayi2,sayi1,sayi3);
            }
            else {
                System.out.printf("%d>%d>%d",sayi2,sayi3,sayi1);
            }
        }else if (sayi3>sayi1 && sayi3 > sayi3){
            if (sayi2 > sayi3){
                System.out.printf("%d>%d>%d",sayi3,sayi2,sayi1);
            }
            else {
                System.out.printf("%d>%d>%d",sayi3,sayi1,sayi2);
            }
        }


    }
}
