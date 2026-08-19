package Main.Java.Easy.Array;

import java.util.ArrayList;
import java.util.Collections;

public class MakeEvenPostionedGreated {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(6);

        ArrayList<Integer> res = makeEvenPositionedGreater(arr);

        for (int num : res) {
            System.out.print(num + " ");
        }

    }

    //this uses 1 based indexing for 0 index based array

    public static ArrayList<Integer> makeEvenPositionedGreater(ArrayList<Integer> arr){

        int n = arr.size();

        for(int i=1; i<n;i++){

            if((i+1) %2 ==0) {

                if (arr.get(i) < arr.get(i - 1)) {
                    Collections.swap(arr, i, i - 1);
                }
            }
            else{
                if(arr.get(i)> arr.get(i-1)){
                    Collections.swap(arr, i, i - 1);
                }
            }
        }
        return arr;
    }
}
