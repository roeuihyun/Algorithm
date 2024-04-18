/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Scanner;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
 * 제한사항
 * -100,000 ≤ a, b ≤ 100,000
 * str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
 * 입출력 예 설명
 * 입력 #1
 * 4 5
 * 출력 #1
 * a = 4
 * b = 5
 */
public class PrintAandB {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
    }

}
