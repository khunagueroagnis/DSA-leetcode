package Main.Java.Easy.Array;

import static java.lang.System.out;

public class DuplicateWithinKDistance {

    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 2, 3, 1, 4, 5};

        out.println(DuplicateWithinKDistance(arr, k));

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
}


