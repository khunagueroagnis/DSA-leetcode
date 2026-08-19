package Main.Java.Easy.Array;

import java.util.HashSet;

import static java.lang.System.out;

public class DuplicateWithinKDistance {

    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 2, 3, 1, 4, 5};
        int arr1[] = {1,2,3,4,56,78,34};

        out.println(DuplicateWithinKDistance(arr, k));
        out.println(duplicateWithinKDistanceHashSet(arr1,k));

    }

    public static boolean DuplicateWithinKDistance(int arr[], int k){
        int n = arr.length;

        for(int i=0; i<n;i++){
            for(int c=1; c<=k && c+i <n; c++){
                int j = i+c;
                if(arr[i] == arr[j]){
                    return  true;
                }
            }
        }
        return false;
    }

    // finding if duplicate exists within k distance via hashset (optimized approach)

    public static boolean duplicateWithinKDistanceHashSet(int arr[], int k){
        int n = arr.length;

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<n;i++){

            if(hs.contains(arr[i])){
                return true;
            }
            hs.add(arr[i]);
            if (i >= k){
                hs.remove(arr[i-k]);
            }
        }
        return false;
    }
}


