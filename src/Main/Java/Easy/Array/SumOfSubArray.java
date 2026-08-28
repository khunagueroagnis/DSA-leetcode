package Main.Java.Easy.Array;

public class SumOfSubArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int sum =0;
        for(int i=0; i< arr.length; i++){
            int temp=0;
            for(int j=i; j<arr.length;j++){
               temp+= arr[j];
                sum += temp;
            }

        }
        System.out.println(sum);

    }
}
