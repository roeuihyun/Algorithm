/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 배열 numbers와 정수 n이 매개변수로 주어집니다. 
 * numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 
 * 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 100
 * 1 ≤ numbers의 원소 ≤ 100
 * 0 ≤ n < numbers의 모든 원소의 합
 */
public class AddUntilGreaterThanN {
	
	public static void main(String[] args) {
		
		AddUntilGreaterThanN run = new AddUntilGreaterThanN();
		int[] numbers1 = {34, 5, 71, 29, 100, 34};
		int n1 = 123;
		
		int[] numbers2 = {34, 5, 71, 29, 100, 34};
		int n2 = 139;
		
        System.out.println(run.solution(numbers1,n1));
        System.out.println(run.solution(numbers2,n2));
	    
	}
	
    public int solution(int[] numbers, int n) {
        return Arrays.stream(numbers)
        			.reduce((x,y) -> x > n ? x : x + y).getAsInt();
    }


}
