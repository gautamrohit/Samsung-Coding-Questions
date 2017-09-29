/*
find number of triangle made in an array using n^3 complexity.
 */
import java.util.*;
public class NUMBER_OF_TRIANGLES_IN_ARRAY_IN_N_CUBE_COMPLEXITY {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k])
                        count++;
                }
            }
        }
        System.out.println("count = "+count);
    }
    
}
