
public class Palindrome {
    public static void main(String[] args) {
        String t = "DoID";

        Boolean res = true;

        int i = 0; 
        int j = t.length() - 1;
        while(i < j){
            if(t.charAt(i) != t.charAt(j)) {
                res = false;
                System.out.println(t + " is not a palindrome");
                break;
            }
            i++;
            j--;
        }

       if(res) System.out.println(t + " is palindrome");

    }
}
