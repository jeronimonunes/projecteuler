import java.util.Arrays;

public class Sol {
    
    public static void main(String[] args) {
        long n = 600851475143L;
        int s = (int)Math.sqrt(n);
        boolean[] primes = new boolean[s];
        Arrays.fill(primes, true);
        int candidate = 1;
        for(int i = 3; i < primes.length; i+=2 ) {
            if(primes[i]) {
                if(n%i == 0) candidate = i;
                for(int j = i+i; j < primes.length; j+=i) {
                    primes[j] = false;
                }
            }
        }
        System.out.println(candidate);
    }

}