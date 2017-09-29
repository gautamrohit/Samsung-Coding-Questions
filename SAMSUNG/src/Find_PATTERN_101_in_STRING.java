import java.util.*;
public class Find_PATTERN_101_in_STRING {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n!=0){
            String s=scan.next();
            char ch[]=s.toCharArray();
            int count=0,on=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='1' && on==0)
                    on=1;
                else if(ch[i]!='0' && ch[i]!='1'){
                    on=0;
                }
                else if(ch[i]=='1' && on==1){
                    if(ch[i-1]=='0')
                        count++;
                }
            }
            System.out.println(count);
            n--;
        }
    }
}
