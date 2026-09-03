package Main.Java.Easy.String;

public class CheckForBinary {
    public static void main(String[] args) {

        String s = "0111304";
        String k = "01011101101";

        System.out.println(checkIfBinary(s));
        System.out.println(checkIfBinary(k));

    }

    public static boolean checkIfBinary(String s){
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1'){
                return false;
            }
        }
        return true;
    }
}
