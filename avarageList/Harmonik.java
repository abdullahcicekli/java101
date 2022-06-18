package avarageList;

public class Harmonik {

    static double harmonik (int sayi){
        double toplam = 0.0;
        for (int i = 1; i<=sayi;i++){
            if (i ==1){
                toplam = toplam+1;
            }else{
                toplam = toplam + (1/sayi);
            }
        }
        return toplam;
    }
}
