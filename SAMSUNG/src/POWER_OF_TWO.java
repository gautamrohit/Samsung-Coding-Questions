import java.util.*;
public class POWER_OF_TWO {
    static boolean isPowerOfTwo (long x)
    {
      /* First x in the below expression is 
        for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);
         
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            long n=scan.nextLong();
            System.out.println(isPowerOfTwo(n) ? "Yes" : "No");
            t--;
        }
    }
}
