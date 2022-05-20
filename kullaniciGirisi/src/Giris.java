import java.util.Scanner;

//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
//eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
//gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
//sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.


public class Giris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username1 = "patika";
        String password1 = "java123";

        System.out.print("Kullanıcı Adı : ");
        String username = sc.nextLine();

        System.out.print("Şifre : ");
        String password = sc.nextLine();

        if (username1.equals(username) && password1.equals(password)){
            System.out.print("Giriş Yaptınız.");
        }
        else {
            System.out.println("Kullanıcı Adı veya Şifre Yanlış.");
            System.out.println("1-Yeni Şifre Oluştur\n2-Çık");
            int sec = sc.nextInt();
            switch (sec){
                case 1:
                    System.out.print("Yeni Şifre Girin : ");
                    String newPassword = sc.next();
                    if (newPassword.equals(password1)) {
                        System.out.print("Girdiğiniz şifre eski şifreniz ile aynı olamaz");
                        break;
                    }
                    else {
                        System.out.print("Yeni Şifre Oluşturuldu.");
                        break;
                    }

                case 2:
                    System.out.print("Çıkış Yaptınız.");
                    break;
            }
        }


    }
}
