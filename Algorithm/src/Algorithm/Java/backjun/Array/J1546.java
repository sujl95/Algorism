package Algorithm.Java.backjun.Array;
import java.util.*;
public class J1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = 0;
		int[] arr = new int[N] ;
		double sum = 0;
		double[] arr1 = new double[N];

		if (0< N && N <= 1_000) {
			for (int i =0; i < N; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] > M) {
					M  = arr[i];
				}
			}
			for (int i =0; i< N ; i++) {
				arr1[i] = arr[i]/M * 100;
				sum += arr1[i];
			}
			sum /= N;
		}
		System.out.println(Math.round(sum * 1_000_000) / 1_000_000.0);
	}

}
