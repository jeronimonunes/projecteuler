public class Sol {
    public static void main(String[] args) {
        long p = 1;
        long u = 2;
        long r = 0;
        while(u < 4e6) {
            if(u%2==0) r += u;
            long a = u + p;
            p = u;
            u = a;
        }
        System.out.println(r);
    }
}