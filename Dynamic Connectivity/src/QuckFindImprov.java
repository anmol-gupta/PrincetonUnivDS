import java.util.Arrays;
import java.util.Scanner;

public class QuckFindImprov {

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
				System.out.println(p + " " + q + " Joined");
			} else 
				System.out.println("Already Connected");
		}
		sc.close();
	}
	}

class QuickFindImprov {
	private int[] arr;
	private int[] szTree;
	
	public int root(int i) {
		if(i!=arr[i]) {
			i = arr[i];
		}
		return i;
	}
	
	public QuickFindImprov(int N) {
		szTree = new int[N];
		Arrays.fill(szTree, 0);
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}
	}
	public void union(int p, int q)  {
		int pidx = root(p);
		int qidx = root(q);
		if(pidx == qidx) {
			return;
		}
		if(szTree[pidx] < szTree[qidx]) {
			arr[p] = qidx;
			szTree[qidx] += szTree[pidx];
		} else {
			arr[q] = pidx;
			szTree[pidx] += szTree[qidx];
		}
	}
}

// Here unlike quickunion we have compressed the height of tree by always connecting small tree
// as a child of big tree. So time complexity will be O(lgN).
