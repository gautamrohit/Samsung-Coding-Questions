//01000110
import java.util.*;
public class SWAP_NIBBLES_IN_A_BYTE_OF_NUMBER {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int x=scan.nextInt();
            List<Integer> li=new LinkedList<Integer>();
            while(x!=0){
                li.add(x%2);
                x/=2;
            }
            while(li.size()!=8){
                li.add(0);
            }
            Collections.reverse(li);
            String s1=new String();
            String s2=new String();
            for(int i=0;i<4;i++){
                s1+=li.get(i);
            }
            for(int i=4;i<8;i++){
                s2+=li.get(i);
            }
            s2+=s1;
            int sum=0,c=0;
            for(int i=7;i>=0;i--){ 
                if(s2.charAt(i)=='1'){
                    sum+=Math.pow(2, c);
                }
                c++;
            }
            System.out.println(sum);
            t--;
        }
    }
}
