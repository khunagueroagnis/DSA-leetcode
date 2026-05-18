package Main.Java.Basic.Array;

public class Minimum_cost_to_make_array_size_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,4,7,10};
        System.out.println(min_cost(arr));

    }
    public static int min_cost( int[] arr){
        int min= arr[0];
        int n = arr.length;
        for(int i: arr){
            if(min>i){
                min=i;
            }
        }
        return (n-1)*min;
    }
}
