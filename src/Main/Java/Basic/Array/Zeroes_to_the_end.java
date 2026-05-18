package Main.Java.Basic.Array;

public class Zeroes_to_the_end {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,9};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for(int j:arr){
            System.out.print(j);
        }
    }
}
