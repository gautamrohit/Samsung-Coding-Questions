/*
You are given an unsorted array with both positive and negative elements.
You have to find the smallest positive number missing from the array in O(n)
time using constant extra space.

Input:
First line consists of T test cases. First line of every test case consists of N,
denoting the number of elements in array. Second line of every test case consists of elements in array.

Output:
Single line output, print the smallest positive number missing.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class MIN_POSITIVE_MISS_NUM_IN_ARRAY {
    public static int get(int []arr, int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }
    public static int finding(int []arr,int n){
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i])-1<n && arr[Math.abs(arr[i])-1]>0){
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n!=0){
		    int size=scan.nextInt();
		    int arr[]=new int[size];
		    for(int i=0;i<size;i++){
		        arr[i]=scan.nextInt();
		    }
		    int count=get(arr, arr.length);
                    int arr2[]=new int[arr.length-count],j=0;
		    for(int i=count;i<arr.length;i++){
                        arr2[j]=arr[i];
                        j++;
                    }
                    System.out.println(finding(arr2,j));
		    n--;
		}
	}
}
