/*
Given an array A [ ] having distinct elements, the task is to find the next greater element for each 
element of the array in order of their appearance in the array. If no such element exists, output -1 
Input:
The first line of input contains a single integer T denoting the number of test cases.Then T test
cases follow. Each test case consists of two lines.The first line contains an integer N denoting 
the size of the array.The Second line of each test case contains N space separated positive 
integers denoting the values/elements in the array A[ ].
Output:
print in a new line, the next greater element for each array element separated by space in order.
 */

import java.util.*;
public class NEXT_LARGER_ELEMENT_OF_ECH_ELEMENT_OF_ARRAY {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            int arr1[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            int check=0;
            for(int i=0;i<n;i++){
               check=1;
               for(int j=1+i;j<n && check==1;j++){
                   if(arr[i]<arr[j]){
                       arr1[i]=arr[j];
                       check=0;
                   }
               }
            }
            
            for(int i=0;i<n;i++){
                if(arr1[i]!=0)
                    System.out.print(arr1[i]+" ");
                else
                    System.out.print(-1+" ");
            }
            System.out.println();
            t--;
        }
    }
}
