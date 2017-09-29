import java.util.*;
public class PERMUTATION_OF_A_NUMBER_HAVING_NO_REPEATED_VALUES {
       public static String swap(String s,int i,int j){
        char ch[]=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;       
        return String.valueOf(ch);
    }
    public static void permute(String s,int l,int r, Set li){
        if(l==r){
            //System.out.println(s);
            li.add(s);
        }
        else{
            for(int i=l;i<=r;i++){
                s=swap(s,l,i);
                permute(s,l+1,r,li); //permute the remaining element lefting lth item
                s=swap(s,l,i); //backtracking
            }
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            String s=scan.next();
            int i=0;
            Set<String> li=new LinkedHashSet<String>();
            permute(s,0,s.length()-1,li);
            String arr[]=new String[li.size()];   
            Iterator iterator = li.iterator(); 
            while(iterator.hasNext()){
                arr[i]=String.valueOf(iterator.next());
                i++;
            }
            boolean bool=false;
            int a=0;
            for(int j=0;j<arr.length;j++)
                System.out.print(arr[j]+" ");
            System.out.println();
            t--;
        }
    }
}
