import java.util.*;
public class PERMUTATIONS_OF_A_STRING {
    public static String swap(String s,int l,int r){
        char arr[]=s.toCharArray();
        char c=arr[l];
        arr[l]=arr[r];
        arr[r]=c;
        return String.valueOf(arr);
    }
    public static void permute(String s,int l,int r, List ls){
        if(l==r){
            ls.add(s);
            //System.out.print(s+" ");
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
        int t=scan.nextInt();
        while(t!=0){
            String s=scan.next();
            List<Character> ls=new LinkedList<Character>();
            permute(s,0,s.length()-1,ls);
            Collections.sort(ls);
            //System.out.println(ls);
            for(int i=0;i<ls.size();i++)
                System.out.print(ls.get(i)+" ");
            System.out.println();
            t--;
        }
        
    }
}
