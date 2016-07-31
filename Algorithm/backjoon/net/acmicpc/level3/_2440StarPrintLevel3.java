/**
 * 
 */
package net.acmicpc.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
 * 2440번
 * 출력
 */
public class _2440StarPrintLevel3 {

	public static void main(String[] args) {
		try {
			int input = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			for(int i = 1; i <= input; i++){
				for(int j = input; j >= i; j--){
					System.out.print("*");
				}
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
