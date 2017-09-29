import java.util.*;
import java.lang.*;
import java.io.*;

class REVERSE_SEN_SEP {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n!=0){
                    String s=new String();
                    s=scan.next();
                    String str[]=s.split("\\.");
                    StringBuilder sb=new StringBuilder();
                    sb.append(str[str.length-1]);
                    for(int i=str.length-2;i>=0;i--){
                        sb.append(".").append(str[i]);
                    }
                    System.out.println(sb);
                    n--;
		}
	}
}