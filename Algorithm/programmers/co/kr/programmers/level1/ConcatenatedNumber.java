/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수가 담긴 리스트 num_list가 주어집니다. 
 * num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 * num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
 */
public class ConcatenatedNumber {
	
	public static void main(String[] args) {
		
		ConcatenatedNumber run = new ConcatenatedNumber();
		
		int[] num_list1 = {3, 4, 5, 2, 1};
		int[] num_list2 = {5, 7, 8, 3};
		
        System.out.println("run.solution(num_list1) : " + run.solution(num_list1));
        System.out.println("run.solution(num_list2) : " + run.solution(num_list2));
	    
	}
	
    public int solution(int[] num_list) {
		return Arrays.stream(num_list)
                .mapToObj(String::valueOf)
                .collect(Collectors.partitioningBy(num -> Integer.parseInt(num) % 2 != 0))
                .values()
                .stream()
                .map(list -> list.stream().reduce("", (x, y) -> x + y))
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
