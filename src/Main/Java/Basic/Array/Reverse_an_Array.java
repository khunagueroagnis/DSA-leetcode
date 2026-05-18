package Main.Java.Basic.Array;

public class Reverse_an_Array {

    public static void main(String[] args) {
        int[] arr= {9,8,7,6,5,4,3,2,1};

        int left =0, right=arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        for(int k: arr){
            System.out.print(k);
        }
    }

}
