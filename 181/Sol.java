import java.util.HashMap;

public class Sol {
	
	public static void main(String[] args) {
		System.out.println(solve(60,40));
	}

	public static long solve(int nb, int nw) {
		int nbp = nb + 1;
		int nwp = nw + 1;
		long[][] previous = new long[nbp][nwp];
		long[][] current = null;

		previous[0][0] = 1;

		for (int b = 0; b < nbp; b++) {
			for (int w = b == 0?1:0; w < nwp; w++) {
				current = new long[nbp][nwp];
				for (int i = 0; i < nbp; i++) {
					for (int j = 0; j < nwp; j++) {
						for(int k = 0; k * b <= i && k * w <= j; k++) {
							current[i][j] += previous[i - k * b][j - k *  w];
						}
					}
				}
				previous = current;
			}
		}
		return current[nb][nw];
	}
}
