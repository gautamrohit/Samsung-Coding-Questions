/*
Write an efficient program to count number of 1s in binary representation of an integer.
 */
import java.util.*;
public class COUNT_NUMBER_OF_SET_BIT_OF_A_NUMBER {
    public static int SET_BIT_COUNT(int a){
        int count=0;
        
        while(a!=0){
            a=a&(a-1);
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(SET_BIT_COUNT(a));
    }
}
