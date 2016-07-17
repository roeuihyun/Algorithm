/**
 * 
 */
package net.acmicpc.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * A-B를 계산하시오.
 * 첫째 줄에 A와 B가 주어진다. (0< A,B < 10)
 * 첫째 줄에 A-B를 출력한다.
 * 1001번
 * 사칙연산
 */
public class AMinusB {
	
	public static void main(String[] args) {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		try {
			String[] input = new BufferedReader(inputStream).readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			System.out.println(A - B);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
