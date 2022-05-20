import java.util.Scanner;
public class Hesapla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = sc.nextInt();
        System.out.print("\n4'ün Üsleri : ");
        for (int i=1; i<=sayi; i*=4){
            if (i==1) continue;
            System.out.print("\n"+i);
        }
        System.out.print("\n5'ün Üsleri : ");
        for (int i=1; i<=sayi; i*=5){
            if (i==1) continue;
            System.out.print("\n"+i);
        }
    }
}
