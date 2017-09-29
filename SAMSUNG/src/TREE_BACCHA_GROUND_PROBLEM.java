import java.util.*;

public class TREE_BACCHA_GROUND_PROBLEM {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            String name[]=new String[3];
            name[0]="a";
            name[1]="b";
            name[2]="c";
            int p=0;
            int n=scan.nextInt();
            while(n!=0){
                
                if(n-1==0 || n-3==0 || n-7==0){
                    System.out.println(name[p]);
                    break;
                }
                else{
                    n=n-1;
                    p=(p+1)%3;
                }
            }
            
            t--;
        }
    
    }
}
