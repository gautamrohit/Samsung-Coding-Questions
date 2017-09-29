import java.util.*;
public class LEDDER_MAKING {
    public static void main(String srgs[]){
        Scanner scan=new Scanner(System.in);
        int n=10;
        String s=Integer.toHexString(n);
        //String s=Integer.toBinaryString(n);
        int arr[]=new int[10];
        System.out.println("enter the array");
        for(int i=0;i<10;i++)
            arr[i]=scan.nextInt();
        int left=0;
        int right=arr.length-1;
        int a[]=new int[10];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                a[left]=arr[i];
                left++;
            }
            else{
                a[right]=arr[i];
                right--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
