/*
find number of triangle made in an array.
 */
import java.util.*;
public class NUMBER_OF_TRIANGLES_IN_ARRAY_IN_N_SQURE_COMPLEXITY {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        Arrays.sort(arr);
        int k=0,count=0;
        for(int i=0;i<n-2;i++){
            k=i+2;
            for(int j=i+1;j<n-1;j++){
                while(k<n && arr[i]+arr[j]>arr[k])
                    ++k;
                count=count+k-j-1;
            }
        }
        System.out.println("count = "+count);
    }
}
