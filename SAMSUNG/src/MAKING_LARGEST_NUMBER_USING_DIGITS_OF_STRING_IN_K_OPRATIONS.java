/*
Given a number K and string S of digits denoting a positive integer, build the largest number possible 
by performing swap operations on the digits of S atmost K times.

Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
The first line of each test case contains a positive integer K.
The second line of each test case contains a string of digits denoting a positive integer.


Output
Print out the largest number possible.
 */
import java.util.*;
public class MAKING_LARGEST_NUMBER_USING_DIGITS_OF_STRING_IN_K_OPRATIONS {
    public static String swap(String s,int i,int j){
        char ch[]=s.toCharArray();
        char tar=ch[i];
        ch[i]=ch[j];
        ch[j]=tar;
        String p="";
        for(char c:ch)
            p+=c;
        //System.out.println("rohit"+p);
        return p;
    }
    public static String back(String s, int k, String max){
        if(k==0)
            return max;

            int n=s.length();
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if((int)s.charAt(i)<(int)s.charAt(j)){
                        s=swap(s,i,j);
                        System.out.println("rohit "+max);
                        if(Integer.parseInt(s)>Integer.parseInt(max))
                            max=s;
                        back(s,k-1,max);
                        s=swap(s,i,j);
                    }
                }           
            }
        
        return max;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int k=scan.nextInt();
            String s=scan.next();
            String max=s;
            
            System.out.println(back(s,k,max));
            t--;
        }
    }
}
