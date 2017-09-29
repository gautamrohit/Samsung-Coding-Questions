/*
Given an array containing equal number of positive and negative elements, arrange the array 
such that every positive element is followed by a negative element.
Input:
2
6
-1 2 -3 4 -5 6
4
-3 2 -4 1
Output:
2 -1 4 -3 6 -5
2 -3 1 -4
 */
import java.util.*;
public class ARRANGE_POSITIVE_AND_NEGATIVE_ELEMENT_OF_ARRAY {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            int a[]=new int[n/2];
            int b[]=new int[n/2], p=0,q=0;
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    a[p]=arr[i];
                    p++;
                }
                else{
                    b[q]=arr[i];
                    q++;
                }
            }
            p=q=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    arr[i]=a[p];
                    p++;
                }
                else{
                    arr[i]=b[q];
                    q++;
                }
            }
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            t--;
        }
    }
}
