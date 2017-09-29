/*
Given a string, recursively remove adjacent duplicate characters from string. The output string should not 
have any adjacent duplicates.
Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow.
Each test case contains an string str.

Output:
For each test case output a new line containing the resulting string.
Example:
Input:
2
geeksforgeek
acaaabbbacdddd

Output:
gksforgk
acac
 */
import java.util.*;
public class RemoveAdjacentDuplicates {
    
    public static String removeAdjacent(char[] str,int len){
        int j = 0;
        for (int i=1;i<len;i++){
            while((j>=0) && i<len && (str[i]==str[j])){
                i++;
                j--;
            }
            if (i<len)
            str[++j]=str[i];
        }
        char[] ch=new char[j+1];
        for (int k = 0; k <= j; k++) {
        ch[k] = str[k];
        }
        return new String(ch);
    }
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            String s=scan.next();
            System.out.println(removeAdjacent(s.toCharArray(),s.toCharArray().length));
            t--;
        }
    }
}
