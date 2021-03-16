package Algorithm.Java.backjun.dynamic;

import java.util.Scanner;

public class J9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[11];
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			for(int j=4; j<=N; j++) {
				arr[j] = arr[j-1] + arr[j-2]+arr[j-3];
			}
			System.out.println(arr[N]);
		}
	}

}
