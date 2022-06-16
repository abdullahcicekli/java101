package calculator;
import java.util.Scanner;

public class Calculate {

    static void plus (){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı : (Çıkmak için 0 giriniz)");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mode(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = scan.nextInt();
        System.out.print("Mod Giriniz : ");
        int mod = scan.nextInt();
        int result = n / mod;
        System.out.print("Sonuç : "+ result );
    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        String menu = "\n1- Dikdörtgen Alan Hesaplama\n"
                + "2- Dikdörtgen Çevre Hesaplama\n";
        System.out.print(menu);
        int n = scan.nextInt();
        if (n == 1) {
            System.out.print("Kenar 1 Giriniz : ");
            int kenar1 = scan.nextInt();
            System.out.print("Kenar 2 Giriniz : ");
            int kenar2 = scan.nextInt();
            int result = kenar2*kenar1;
            System.out.println("Sonuç : "+ result);
        }else if(n ==2){

            System.out.print("Kenar 1 Giriniz : ");
            int kenar1 = scan.nextInt();
            System.out.print("Kenar 2 Giriniz : ");
            int kenar2 = scan.nextInt();
            int result = (kenar2*2)+(kenar1*2);
            System.out.println("Sonuç : "+ result);
            }
        else{
            System.out.println("Yanlış bir değer girdiniz.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = "\n1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("\nLütfen bir işlem seçiniz :");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nYanlış bir değer girdiniz, tekrar deneyiniz.\n");
            }
        } while (select != 0);

    }
}
