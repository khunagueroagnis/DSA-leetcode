package Main.Java.Basic.String;

public class Reverse {
    public static void main(String[] args) {

        int a = 12222131;
        int num = a;
        int reverse = 0;
        while (a!=0){
            int k = a%10;
            reverse = reverse*10 + k;
            a /=10;
        }
        if(reverse == num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }



}
