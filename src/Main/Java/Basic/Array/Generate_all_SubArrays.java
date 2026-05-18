package Main.Java.Basic.Array;

import java.util.ArrayList;

public class Generate_all_SubArrays {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        subArray(arr);

    }

    public static void subArray(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr.get(k)+" ");
                }
                System.out.println();
            }
        }
    }

}
