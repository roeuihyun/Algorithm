/**
 * 
 */
package net.acmicpc.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 
 * 하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
 * 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
 * 2439번
 * 출력
 */
public class _2439StarPrintLevel2 {
	
	public static void main(String[] args) {
		try {
			int input = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			for(int i = 1; i <= input; i++){
				for(int j = input; j >= 1; j--){
					if(i >= j){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
