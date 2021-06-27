package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class J11399_S3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int temp = 0;
		int res = 0;

		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
				.sorted()
				.toArray();
		for (int i = 0; i < N; i++) {
			temp += arr[i];
			res += temp;
		}
		System.out.println(res);
	}
}
