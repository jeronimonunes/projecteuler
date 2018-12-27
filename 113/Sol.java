import java.math.BigInteger;

public class Sol {

    public static BigInteger number(int n, BigInteger a) {
        if(n == 0) {
            return a;
        } else {
            return number(n-1,a*10);
        }
    }

    public static long increasing(int n, int m) {
        if(n==0) {
            return 1;
        }
        long result = 0;
        n--;
        for(int i = 0; i <= m; i++) {
            result += increasing(n, m - i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(number(100,1));
    }
}