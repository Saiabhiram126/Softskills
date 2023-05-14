import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = myObj.nextInt();
        }
        int k = myObj.nextInt();
        k = k%n;
        int kn = k+n;
        int[] arr1 = new int[kn];
        for(int j=k; j<kn;j++){
            arr1[j] = arr [j-k]; 
        }
        for(int i=0;i<k;i++){
            arr1[i] = arr[n-k+i];
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr1[i]);
        }
    }
}
