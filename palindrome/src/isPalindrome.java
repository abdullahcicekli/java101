public class isPalindrome {

    static boolean isPalindrome(int number){

        int tmp = number , reverseNum = 0, lastNum = 0;
        while(tmp != 0){
            lastNum = tmp % 10;
            reverseNum = (reverseNum*10) + lastNum;
            tmp /= 10;
        }

        if (number == reverseNum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));

    }
}
