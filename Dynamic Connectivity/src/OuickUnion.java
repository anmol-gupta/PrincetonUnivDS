import java.util.*;

public class OuickUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		QuickUnionImplementation qf = new QuickUnionImplementation(N);
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

class QuickUnionImplementation {
	private int[] arr;

	public QuickUnionImplementation(int N) {
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}
	}

	private int root(int i) {
		while (i != arr[i]) {
			i = arr[i];
		}
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int pidx = root(p);
		int qidx = root(q);
		arr[pidx] = qidx;
	}
}

// Time Complexity better than QuickFind but here finding root is expensive
// Also for bigger problems trees can become large