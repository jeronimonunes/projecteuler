import java.util.Arrays;

public class Sol {

    private static boolean valid(int n) {
        for(int i = 1; i <= 20; i++) {
            if(n%i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 1; ;i++) {
            if(valid(i)) {
                System.out.println(i);
                break;
            }
        }
    }

}