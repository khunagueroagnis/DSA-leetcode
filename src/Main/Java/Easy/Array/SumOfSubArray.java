package Main.Java.Easy.Array;

public class SumOfSubArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int sum =0;
        for(int i=0; i< arr.length; i++){
            for(int j=i; j<arr.length;j++){
                for(int k=i; k<=j; k++){
                    sum += k;
                }
            }
        }
        System.out.println(sum);

    }
}
