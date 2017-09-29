/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohit Gautam
 */
import java.util.*;
public class SUM_OF_LENGHT_OF_NON_OVERLAPING_ARRAYS {
    public static void check(int arr[], int l,int r, int tar){
        int count=0,sum=0,set=0,run=0;
        for(int i=l;i<r;){
            count=0;
            set=0;
            while(i<r && arr[i]<=tar){
                count++;
                if(arr[i]==tar)
                    set=1;
                i++;
            }
            if(set==1)
                sum+=count;
            while( i<r && arr[i]>tar)
                i++;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            int tar=scan.nextInt();
            check(arr, 0, n, tar);
            t--;
        }
    }
}
