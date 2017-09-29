
import java.util.Scanner;
import java.util.*;

public class SUM_OF_PRIMES_USING_SIEME {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            long sum=0;
            int arr[]=new int[n+1];
            for(int i=0;i<=n;i++)
                arr[i]=i;
            for(int i=2;i*i<=n;i++){                
                for(int j=2*i;j<=n;j+=i){
                    arr[j]=0;                   
                }
            }
            for(int i=2;i<=n;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
            t--;
        }
    }
}
