import java.math.BigDecimal;
import java.util.HashMap;

public class Sol {

    public static BigDecimal number(int n, BigDecimal a) {
        if(n == 0) {
            return a;
        } else {
            return number(n-1,a.scaleByPowerOfTen(1));
        }
    }
    
    private static HashMap<Integer, HashMap<Integer,BigDecimal>> increasingCache = new HashMap<>();

    public static BigDecimal increasing(int n, int m) {
    	if(n == 0) {
    		return BigDecimal.ONE;
    	}
    	HashMap<Integer,BigDecimal> cache2 = increasingCache.get(n);
    	if(cache2 == null) {
    		increasingCache.put(n, cache2 = new HashMap<>());
    	}
        BigDecimal val = cache2.get(m);
        if(val == null) {
        	BigDecimal result = BigDecimal.ZERO;
	        n--;
	        for(int i = m; i <= 9; i++) {
	        	result = result.add(increasing(n, i));
	        }
	        cache2.put(m, result);
	        return result;
        } else {
        	return val;
        }
    }
    
    public static BigDecimal increasing(int n) {
    	return increasing(n, 0);
    }

    public static void main(String[] args) {
    	System.out.println(increasing(2,7));
    	System.out.println(number(100,BigDecimal.ONE).subtract(increasing(100).multiply(new BigDecimal(2))).add(BigDecimal.TEN));
    }
}