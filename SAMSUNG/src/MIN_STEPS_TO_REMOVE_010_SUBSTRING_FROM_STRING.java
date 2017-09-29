import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MIN_STEPS_TO_REMOVE_010_SUBSTRING_FROM_STRING {

    static int minSteps(int n, String B){
        int set=0,count=0;
        for(int i=0;i<n;){
            if(B.contains("01010")){
                count++;
                i=i+4;
            }
            else if(B.contains("010")){
                count++;
                i=i+2;
            }
            else
                i++;
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}

