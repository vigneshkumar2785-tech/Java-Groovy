import java.util.LinkedList;

public class PalindromeUsingCollection {
    public static void main(String[] args) {
        LinkedList<Integer> s = new LinkedList<>();
        s.add(12321);
        for(int i = 0; i<s.size(); i++)
        {
            if(s.size() == s.size()-1)
            {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not Palindrome");
            }
        }

    }
}
