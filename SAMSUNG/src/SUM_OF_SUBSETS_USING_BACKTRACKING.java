import java.util.*;
public class SUM_OF_SUBSETS_USING_BACKTRACKING {
    public static void back(int arr[],int l,int r,int s,int sum_far,List arr1){
        if(s==sum_far){
            System.out.println();

            back(arr,l+1,r,s,sum_far-arr[l],arr1);
            //arr1[l-1]=0;
            return;
        }
        for(int i=l;i<arr.length;i++){
            if(arr[l]+sum_far<s ){
            back(arr,l+1,r,s,sum_far+arr[l],arr1);
        }
        if(arr[l]+sum_far>s ){
            //arr1[l]=0;
            back(arr,l+1,r,s,sum_far,arr1);
        }
        }
                
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
            arr[i]=scan.nextInt();
        List arr1=new LinkedList();
        int sum=scan.nextInt();
        int sum_far=0;
        back(arr,0,arr.length,sum,sum_far,arr1);
        
    }
}
