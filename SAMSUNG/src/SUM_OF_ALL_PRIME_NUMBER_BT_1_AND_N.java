import java.util.*;
public class SUM_OF_ALL_PRIME_NUMBER_BT_1_AND_N {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            long sum=0;
            int arr[]=new int[n+1];
            for(int i=0;i<=n;i++)
                arr[i]=i;
            rohit :for(int i=2;i<=n;i++){
                for(int j=2;j*j<=i;j++)
                    if(arr[i]%j==0){
                        arr[i]=0;
                        continue rohit;
                    }
            }
            for(int i=2;i<=n;i++)
                sum+=arr[i];
            System.out.println(sum);
            t--;
        }
    }
}
