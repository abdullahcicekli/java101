import java.util.Scanner;

/*
İndex = Kilo (kg) / (Boy(m) * Boy(m))
*/

public class Hesapla {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double boy;
        int kilo;

        System.out.println("Lütfen boyunuzu girin (örn : 1.86) : ");
        boy = sc.nextDouble();
        System.out.println("Lütfen kilonuzu girin (örn : 88) : ");
        kilo = sc.nextInt();

        double kitle = (kilo / (boy * boy));

        System.out.printf("Vücut Kitle İndexiniz : %f ", kitle);
    }
}