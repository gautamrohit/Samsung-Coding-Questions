/* Enter your code here. Read input from STDIN. Print output to STDOUT 
   Use the classname as 'Solution'
   https://www.interviewstreet.com/recruit/challenges/faq/view#stdio
*/
import java.util.*;
public class FaceBook{
    
    public static String[] swap(String s[],int l,int r){
        
        String p=s[l];
        s[l]=s[r];
        s[r]=p;
        return s;
    }
    public static void permute(String s[],int l,int r, List ls){
        if(l==r){
            String p="";
            for(int i=0;i<=l;i++)
                p+=s[i];
            ls.add(p);
        }
        else{
            for(int i=l;i<=r;i++){
                s=swap(s,l,i);
                permute(s,l+1,r,ls);
                s=swap(s,l,i);
            }
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);       
            String L=scan.nextLine();
            String str[]=L.split("\\s+");
            String S=scan.next();
            List<Character> ls=new LinkedList<Character>();
            permute(str,0,str.length-1,ls);
            Collections.sort(ls);
            int arr[]=new int[ls.size()];
            for(int i=0;i<ls.size();i++){
                arr[i]=S.indexOf(String.valueOf(ls.get(i)));
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=0){
                    System.out.println(arr[i]);
                    break;
                }
            }
    }
}