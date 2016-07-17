/**
 * 
 */
package net.acmicpc.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * (A+B)%C는 (A%C + B%C)%C 와 같을까?
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 * 10430번
 * 사칙연산
 */
public class Namugi {
	
	public static void main(String[] args) {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		try {
			String[] input = new BufferedReader(inputStream).readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			int C = Integer.parseInt(input[2]);
			System.out.println((A+B)%C);
			System.out.println((A%C + B%C)%C);
			System.out.println((A*B)%C);
			System.out.println((A%C * B%C)%C);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}