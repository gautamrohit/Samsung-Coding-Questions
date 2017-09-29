/*
Given two strings a and b print whether they contain any common subsequence (non empty) or not.

Input:
The first line contains an integer T denoting number of testcases. Each of the next T lines
contains two strings a and b.

Output:
Print 1 if they have a common subsequence (non empty) else 0.
 */
import java.util.*;
public class COMMON_SUBSEQENCE_IN_TWO_STRING_CHECKING_ONLY {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            String a=scan.next();
            String b=scan.next();
            char arr1[]=a.toCharArray();
            char arr2[]=b.toCharArray();
            int set=0;
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    if(arr1[i]==arr2[j]){
                        set=1;
                        break;
                    }
                        
                }
            }
            if(set==0)
                System.out.println(0);
            else
                System.out.println(1);
            t--;
        }
    }
}
