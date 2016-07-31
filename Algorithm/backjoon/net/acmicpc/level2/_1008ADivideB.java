/**
 * 
 */
package net.acmicpc.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * A/B를 계산하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)
 * 첫째 줄에 A/B를 소수점 9자리 이상 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
 * 1008번
 * 사칙연산
 */
public class _1008ADivideB {
	
	public static void main(String[] args) {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		try {
			String[] input = new BufferedReader(inputStream).readLine().split(" ");
			double A =Double.parseDouble(input[0]);
			double B =Double.parseDouble(input[1]);
			System.out.format("%.15f%n",A / B);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
