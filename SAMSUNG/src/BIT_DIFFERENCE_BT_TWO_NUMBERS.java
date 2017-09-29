/*
0000001111100111=999
0000000001100100=100
You are given two numbers A and B.
Write a program to count number of bits needed to be flipped to convert A to B.
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is a and b.
Output:
Print the number of bits needed to be flipped.
 */
import java.util.*;
public class BIT_DIFFERENCE_BT_TWO_NUMBERS {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int a=scan.nextInt();
            int b=scan.nextInt();
            String s1=Integer.toString(a,2);
            String s2=Integer.toString(b,2);
            for(int i=0;i<16;i++){
                if(s1.length()!=16)
                    s1='0'+s1;
                if(s2.length()!=16)
                    s2='0'+s2;
            }
            //System.out.println(s1+" "+s2);
            int count=0;
            for(int i=0;i<16;i++){
                if(s1.charAt(i)!=s2.charAt(i))
                    count++;
            }
            System.out.println(count);
            t--;
        }
    }
}
