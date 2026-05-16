package Main.Java.Basic;

public class Rotate_an_array_while_loop {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,};
        int k = 3;
        int n = arr.length;
        reverse(arr,0,n);

        reverse(arr,0,k);
        reverse(arr,k,n);

        for(int i: arr){
            System.out.print(i);
        }

    }

    public static int[] reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1]=temp;
            start++;
            end--;
        }
        return arr;
    }

}
