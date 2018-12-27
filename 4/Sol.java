import java.util.Arrays;

public class Sol {

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int l = s.length()/2;
        for(int i = 0; i < l; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        for(int i = 999; i > 99; i--) {
            for(int j = 999; j > 99; j--) {
                int r = i*j;
                if(isPalindrome(r) && r > c) {
                    c = r;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(a + " x " + b + " = " + c);
    }

}