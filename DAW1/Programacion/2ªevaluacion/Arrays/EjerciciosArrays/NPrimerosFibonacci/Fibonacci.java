
public class Fibonacci {

	public static int[] nPrimerosFibonacci(int nPrimeros) {
		int[] nPrimerosFibonacci = new int[nPrimeros];
		nPrimerosFibonacci[0] = 0;
		nPrimerosFibonacci[1] = 1;
		int i = 2;
		while(i < nPrimeros) {
			nPrimerosFibonacci[i] = nPrimerosFibonacci[i-1] + nPrimerosFibonacci[i-2];
			i++;
		}
		return nPrimerosFibonacci;
	}
}
