import java.util.Scanner;
public class Hesapla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin : ");
        int yil = sc.nextInt();
        System.out.printf("Doğum yılınız : %d",yil);

        int kalan = yil%12;

        if(kalan == 0){
            System.out.print("\nÇin Zodyağı Burcunuz : Maymun");
        }else if(kalan == 1){
            System.out.print("\nÇin Zodyağı Burcunuz : Horoz");
        }else if(kalan == 2){
            System.out.print("\nÇin Zodyağı Burcunuz : Köpek");
        }else if(kalan == 3){
            System.out.print("\nÇin Zodyağı Burcunuz : Domuz");
        }else if(kalan == 4){
            System.out.print("\nÇin Zodyağı Burcunuz : Fare");
        }else if(kalan == 5){
            System.out.print("\nÇin Zodyağı Burcunuz : Öküz");
        }else if(kalan == 6){
            System.out.print("\nÇin Zodyağı Burcunuz : Kaplan");
        }else if(kalan == 7){
            System.out.print("\nÇin Zodyağı Burcunuz : Tavşan");
        }else if(kalan == 8){
            System.out.print("\nÇin Zodyağı Burcunuz : Ejderha");
        }else if(kalan == 9){
            System.out.print("\nÇin Zodyağı Burcunuz : Yılan");
        }else if(kalan == 10){
            System.out.print("\nÇin Zodyağı Burcunuz : At");
        }else if(kalan == 11){
            System.out.print("\nÇin Zodyağı Burcunuz : Koyun");
        }else{
            System.out.print("\nLütfen geçerli bir yıl giriniz.");
        }

    }
}
