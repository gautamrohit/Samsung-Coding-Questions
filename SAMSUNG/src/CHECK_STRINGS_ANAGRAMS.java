import java.util.*;
public class CHECK_STRINGS_ANAGRAMS {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        String s2=scan.next();
        List<Character> l1=new LinkedList<Character>();
        List<Character> l2=new LinkedList<Character>();
        for(int i=0;i<s1.length();i++){
            l1.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            l2.add(s2.charAt(i));
        }
        Collections.sort(l1);
        Collections.sort(l2);
        if(l1.equals(l2))
            System.out.println("anagrams");
        else
            System.out.println("not anagrams");
    }
}
