import java.util.*;
public class MAKING_LAST_FOUR_DIGITS_TO_ZERO_IN_SINGLE_LINE {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        
        System.out.println(a & 0xF0);
    }
}

