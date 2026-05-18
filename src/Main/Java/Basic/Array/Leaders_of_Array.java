package Main.Java.Basic.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_of_Array {

    public static void main(String[] args) {
        int[] arr = new int[]{1231213243,435,768,906765,456,4533443,656757,345};

        int n = arr.length;
        int currMax = arr[n-1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(currMax); // since last member of array will always be leader
        for(int i=n-2;i>=0;i--){
            if(arr[i]>currMax){
                res.add(arr[i]);
                currMax = arr[i];
            }

        }
        Collections.sort(res);
        System.out.println(res);
    }
}
