import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = myObj.nextInt();
        }
        int m=0;
        for(int i=1; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(arr[j]-arr[i]>m){
                   m = arr[j]-arr[i];
                }
            }
        }
         System.out.println(m);
    }
}
