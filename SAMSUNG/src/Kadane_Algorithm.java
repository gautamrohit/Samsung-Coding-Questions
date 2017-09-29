/*
an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
 
Input:
The first line of input contains an integer T denoting the number of test cases. The description of T 
test cases follows. The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
 
Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.
 */
import java.util.*;
public class Kadane_Algorithm {
    public static int sum(int arr[],int n){
        int max1=Integer.MIN_VALUE,max2=0;
        for(int i=0;i<n;i++){
            max2=max2+arr[i];
            if(max1<max2)
                max1=max2;
            if(max2<0)
                max2=0;
        }
        return max1;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scan.nextInt();
            
            System.out.println(sum(arr,n));
            t--;
        }
    }
}
