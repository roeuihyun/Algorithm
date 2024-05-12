/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수가 담긴 리스트 num_list가 주어질 때, 
 * 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * num_list의 원소를 모두 곱했을 때 2,147,483,647를 넘는 입력은 주어지지 않습니다.
 */
public class OperationsBasedOnLength {
	
	public static void main(String[] args) {
		
		OperationsBasedOnLength run = new OperationsBasedOnLength();
		
		int[] num_list1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		int[] num_list2 = {2, 3, 4, 5};
		
    	System.out.println("result : " + run.solution(num_list1));
    	System.out.println("result : " + run.solution(num_list2));
        
	}
	
    public int solution(int[] num_list) {
        return Arrays.stream(num_list)
	                .reduce((x, y) -> num_list.length > 11 ? x + y : x * y)
	                .getAsInt(); 
    }

}
