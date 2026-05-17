package Main.Java.Basic;

public class Minimum_increments_k_operations {
    public static void main(String[] args) {
        int[] arr = {18,3,6,9};
        System.out.println(minimum_k(arr,3));
    }

    public static int minimum_k(int[] arr,int k){
        int max=Integer.MIN_VALUE;

        for (int f:arr){
            max = Math.max(max,f);
        }
        int res=0;
        for(int i: arr){
            if((max-i)%k!=0){
                return -1;
            }
            else {
             res += (max-i)/k;


            }
        }
        return res;
    }
}
