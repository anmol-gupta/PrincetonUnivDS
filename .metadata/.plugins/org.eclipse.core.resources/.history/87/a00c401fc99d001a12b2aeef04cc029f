import java.util.*;

public class QuickFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		QuickFindImplementation qf = new QuickFindImplementation(N);
		while (N-- > 0) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (!qf.connected(p, q)) {
				qf.union(p, q);
				System.out.println(p + " " + q);
			}
		}
		sc.close();
	}

}

class QuickFindImplementation {
	private int[] arr;

	public QuickFindImplementation(int N) {
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		return arr[p] == arr[q];
	}

	public void union(int p, int q) {
		int pidx = arr[p];
		int qidx = arr[q];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == pidx) {
				arr[i] = qidx;
			}
		}
	}

}
