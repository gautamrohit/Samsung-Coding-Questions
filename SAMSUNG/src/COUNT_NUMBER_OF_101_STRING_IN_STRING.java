/*
Given a binary string, count number of substrings that start and end with 1. For example, if the input
string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 */
import java.util.*;
public class COUNT_NUMBER_OF_101_STRING_IN_STRING {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            String s=scan.next();
            int arr[]=new int[n];
            
            int count=0,on=0;
rohit:      for(int i=0;i<s.length();i++){
                on=0;
                for(int j=i;j<s.length();j++){
                    if(s.charAt(i)=='1'){
                        if( on==1 && s.charAt(j)=='1')
                            count++;
                        if(s.charAt(j)=='1' && on==0)
                            on=1;
                    }
                    else 
                        continue rohit;
                    
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
