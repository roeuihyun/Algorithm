/**
 * 
 */
package net.acmicpc.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author roeuihyun
 * 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 * 두 번째로 큰 정수를 출력한다.
 * 10817번
 * 출력
 */
public class _10817ThreeNumber {
	
	public static void main(String[] args) {
		try {
			String input[] = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			System.out.println(a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}