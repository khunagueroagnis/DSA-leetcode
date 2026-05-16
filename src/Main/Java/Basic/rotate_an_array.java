package Main.Java.Basic;

import java.util.Collections;

public class rotate_an_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int k= 2; //number of digits to rotate array by
        int n = arr.length;
        //for rotation, you reverse the whole array, then reverse till k value of array, then reverse the rest of array and your array will be rotated.
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        //rotated whole array now for first k numbers.

        for(int i=0;i<k/2;i++){
            int temp=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
        }

        for(int h: arr){
            System.out.print(h);
        }
        System.out.println();

        //reversed till k digit, now to reverse remaining in the array

        for(int i=k;i<=(n+k-1)/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i+k-1];
            arr[n+k-i-1]=temp;
        }

        for(int h: arr){
            System.out.print(h);
        }




    }
}
