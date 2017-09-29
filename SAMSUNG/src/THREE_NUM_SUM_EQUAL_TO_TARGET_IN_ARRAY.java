// complexity O(n^2)
import java.util.*;
public class THREE_NUM_SUM_EQUAL_TO_TARGET_IN_ARRAY {
    public static int check(int []arr,int n, int x){
        int l=0,r=0;
        for(int i=0;i<n-2;i++){
                l=i+1;
                r=n-1;
                while(r>l){
                    if(arr[i]+arr[l]+arr[r]==x){
                        return 1;
                    }
                    else if(arr[i]+arr[l]+arr[r]<x)
                        l++;
                    else
                        r--;
                }
            }
        return -1;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            int x=scan.nextInt(),sum=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            Arrays.sort(arr);
            
            System.out.println(check(arr,n,x));
            t--;
        }
    }
}
