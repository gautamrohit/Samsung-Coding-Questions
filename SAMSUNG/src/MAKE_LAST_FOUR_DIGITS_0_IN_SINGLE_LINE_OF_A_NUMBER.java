/*
Given a number you have to make it last 4 bits 0 in just a single line code.
 */
public class MAKE_LAST_FOUR_DIGITS_0_IN_SINGLE_LINE_OF_A_NUMBER {
    public static void main(String args[]){
        int a=Integer.parseInt(Integer.toBinaryString(19));
        int b=Integer.parseInt(Integer.toBinaryString(16));
        System.out.println(a&b);
    }
}
