package Main.Java.Basic.String;

import java.util.ArrayList;
import java.util.List;


public class Generate_all_substring {
    public static void main(String[] args) {
        String str = "ajay";
        int n = str.length();
        List<String> res = new ArrayList<>();

        for(int i=0; i<n;i++){
            for(int j=i;j<n;j++){
                res.add(str.substring(i, j + 1));
            }
        }
        System.out.println(res);
    }
}
