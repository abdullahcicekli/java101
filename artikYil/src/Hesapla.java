import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Bir yıl Giriniz : ");
        int yil = sc.nextInt();

        if (yil%400==0){
            System.out.printf("%d bir Artık Yıldır.",yil);
        }else{
            if(yil%4==0){
                System.out.printf("%d bir Artık Yıldır.",yil);
            }else{
                System.out.printf("%d bir Artık Yıl Değildir..",yil);
            }
        }
    }
}
