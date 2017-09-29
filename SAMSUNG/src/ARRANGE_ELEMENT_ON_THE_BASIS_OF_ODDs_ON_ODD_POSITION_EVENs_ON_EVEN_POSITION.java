/*
Given an array. The task is to arrange the array such that odd elements occupy the odd positions and 
even elements occupy the even positions. The order of elements must remain same. Consider zero-based indexing.
After printing according to conditions, if remaining, print the remaining elements as it is.
 */
import java.util.*;
public class ARRANGE_ELEMENT_ON_THE_BASIS_OF_ODDs_ON_ODD_POSITION_EVENs_ON_EVEN_POSITION {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scan.nextInt();
            String[] rohit=new String[n];
            String even="";
            String odd="";
            for(int i=0;i<n;i++){
                if(arr[i]%2==0)
                    even+=arr[i];
                else
                    odd+=arr[i];
            }
            int e=0,o=0,i=0;
            int max=even.length()>odd.length()?odd.length():even.length();
            for(i=0;i<n ;i++){
                if(2*max>o+e){
                    if(i%2==0 && even.length()>=e){
                        rohit[i]=String.valueOf(even.charAt(i/2));
                        e++;
                    }
                    if(i%2==1 && odd.length()>=o){
                        rohit[i]=String.valueOf(odd.charAt(i/2));
                        o++;
                    }    
                }
                else break;
                
            }
            while(even.length()<odd.length() && o+e!=n){
                rohit[i]=String.valueOf(odd.charAt(i));
                o++;
                i++;
            }
            while(odd.length()<even.length() && o+e!=n){
                rohit[i]=String.valueOf(even.charAt(i/2));
                e++;
                i++;
            }
            for( i=0;i<n;i++)
                System.out.print(rohit[i]+" ");
            System.out.println();
            
            t--;
        }
    }
}
