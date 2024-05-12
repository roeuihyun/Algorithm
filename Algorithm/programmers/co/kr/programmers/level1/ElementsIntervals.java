/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 
 * return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 5 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ 4
 */
public class ElementsIntervals {
	
	public static void main(String[] args) {
		
		ElementsIntervals run = new ElementsIntervals();
		int[] num_list = {4, 2, 6, 1, 7, 6};
		
        System.out.println(run.solution(num_list,2));
        
        for(int i : run.solution(num_list,2)) {
        	System.out.println("result : " + i);
        }
        
        System.out.println(run.solution(num_list,4));
        
        for(int i : run.solution(num_list,4)) {
        	System.out.println("result : " + i);
        }
	    
	}
	
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length)
						.filter(index -> index % n == 0)
						.map(index -> num_list[index])
						.toArray();
    }

}
