package Main.Java.Basic;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates_from_sorted_Array {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,2,3,3,4,5,6,6,6,7,8,8,9};
        int n=arr.length;
        if(n<=1){
            System.out.println("array has too few values within");
        }

        int j =0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        for(int k=0;k<=j;k++){
            System.out.println(arr[k]);
        }
       }

    }

