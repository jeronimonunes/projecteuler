import java.util.Arrays;

public class Sol {

    public static void main(String[] args) {
        int r = 0;
        int s = 0;
        for(int i = 1; i <= 100; i++) {
            r += i*i;
            s+=i;
        }
        r = s*s - r;
        System.out.println(r);
    }

}