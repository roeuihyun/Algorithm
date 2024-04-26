/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
 * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 */
public class LastTwoElements {
	
	public static void main(String[] args) {
		
		LastTwoElements run = new LastTwoElements();
		
		int[] num_list1 = {2, 1, 6};
		int[] num_list2 = {5, 2, 1, 7, 5};
		
        System.out.println("run.solution(num_list1) : " + run.solution(num_list1));
        System.out.println("run.solution(num_list2) : " + run.solution(num_list2));
        
		for(int each : run.solution(num_list1)) {
			System.out.println(each);
		}
		
		for(int each : run.solution(num_list2)) {
			System.out.println(each);
		}
	    
	}
	
    public int[] solution(int[] num_list) {
    	int[] last_two = Arrays.stream(num_list)
    							.skip(Math.max(0, num_list.length - 2))
    							.toArray();
    	int addValue = last_two[0] < last_two[1] ? last_two[1] - last_two[0] : last_two[1] * 2;
    	int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
    	answer[num_list.length] = addValue;
        return answer;
    }

}
