/**
 * 
 */
package net.acmicpc.level1;

import java.util.Scanner;

/**
 * @author Administrator
 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)
 * 첫째 줄에 A+B를 출력한다.
 * 1000번
 * 사칙연산
 */
public class _1000AAddB {
	
	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        String[] inputArray = input.split(" ");
        int A = Integer.parseInt(inputArray[0]);
        int B = Integer.parseInt(inputArray[1]);
        System.out.println(A + B);
	}
	
}
