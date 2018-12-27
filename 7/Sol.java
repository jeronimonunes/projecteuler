import java.util.Arrays;

public class Sol {
    
    public static void main(String[] args) {
        int s = (int)Math.sqrt(600851475143L);
        boolean[] primes = new boolean[s];
        Arrays.fill(primes, true);
        int n = 1;
        for(int i = 3; i < primes.length; i+=2 ) {
            if(primes[i]) {
                n++;
                if(n == 10001) {
                    System.out.println(i);
                    return;
                }
                for(int j = i+i; j < primes.length; j+=i) {
                    primes[j] = false;
                }
            }
        }
    }

}