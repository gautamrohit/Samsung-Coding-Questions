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
import java.util.Set;
public class REMOVE_DUPLICATES_VALUES_IN_STRING {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            String s=scan.next();
            char ch[]=s.toCharArray();
            Set<Character> st=new LinkedHashSet<Character>();
            for(char c:ch){
                st.add(c);
            }
            String ne=new String();
            for(Character c:st)
                ne+=c;
            System.out.println(ne);
        }
    }
    
}
