/*
Given a string containing only lowercase alphabets, you have to convert it into a string such that
it contains all vowels by doing minimum number of operations. In one operation, you could select a 
substring always starting from index 0, and move that substring up or down (any number of times). 
Following examples are treated as 1 operation.
For Ex:- input-axzf
Let index chosen be 0 to 3and move it up by 2
Output-czbh

For Ex:- input-axze
Let index chosen be 0 to 2 and move it down by 2
Output-yvxe
 */
import java.util.*;
public class MOVE_CHAR_OF_STRING_UP_OR_DOWN_BY_NUMBER_OPERATIONS {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            String s=scan.next();
            int op=scan.nextInt();            
            int arr[]=new int[s.length()];
            for(int i=0;i<s.length();i++){
                arr[i]=(int)(s.charAt(i));
            }
            for(int i=0;i<s.length();i++){
                if(arr[i]+op>122)
                    arr[i]=arr[i]+op-122+96;
                else if(arr[i]+op<97){
                    arr[i]=arr[i]+op+122-96;
                }
                else
                    arr[i]=arr[i]+op;
            }
            String s1="";
            for(int i=0;i<s.length();i++){
                s1+=(char)arr[i];
            }
            System.out.println(s1);
 
            t--;
        }
    }
}
