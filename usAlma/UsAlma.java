package usAlma;
import java.util.Scanner;

public class UsAlma {

    static int exp(int base, int exp){
        Scanner scan = new Scanner(System.in);

        if(exp==1){
            return base;
        }
        if(exp==0){
            return 1;
        }

        return exp(base,exp-1)*exp(base,1);

    }

    public static void main(String[] args) {
        int base,exp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Base : ");
        base = scan.nextInt();
        System.out.print("Exp : ");
        exp = scan.nextInt();

        System.out.println(exp(base,exp));
    }
}
