/**
 * 
 */
package net.acmicpc.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * 두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 * 10869번
 * 사칙연산
 */
public class _10869Arithmetic {
	
	public static void main(String[] args) {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		try {
			String[] input = new BufferedReader(inputStream).readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.println(A % B);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}