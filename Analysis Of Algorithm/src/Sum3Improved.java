import java.util.*;

public class Sum3Improved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Sum3Calculation sum3 = new Sum3Calculation();
		sum3.sortAndCount(arr);
	}

}

class Sum3Calculation {
	boolean flag = false;
	int count = 0;

	public void sortAndCount(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int l = i + 1;
			int r = a.length - 1;
			int ele = a[i];
			while (l < r) {
				if (ele + a[l] + a[r] == 0) {
					System.out.print("Triplet ->" + ele + " " + a[l] + " " + a[r]);
					l++;
					r--;
					flag = true;
				} else if (ele + a[l] + a[r] < 0) {
					l++;
				} else {
					r--;
				}
			}
		}
		if(flag==false) {
			System.out.println("No such triplets!!");
		}
	}
}
