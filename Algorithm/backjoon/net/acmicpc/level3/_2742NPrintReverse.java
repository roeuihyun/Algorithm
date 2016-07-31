/**
 * 
 */
package net.acmicpc.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrator
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * 2742번
 * 출력
 */
public class _2742NPrintReverse {
	
	public static void main(String[] args) {
		try {
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			for(int index = Integer.parseInt(input); index > 0 ; index--){
				System.out.println(index);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
