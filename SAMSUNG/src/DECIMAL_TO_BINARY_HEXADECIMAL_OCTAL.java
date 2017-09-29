
public class DECIMAL_TO_BINARY_HEXADECIMAL_OCTAL {
    public static void main(String args[]){
        int n=4;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toOctalString(n));
        System.out.println(Integer.toString(n, 8));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toString(n, 16));
    }
}
