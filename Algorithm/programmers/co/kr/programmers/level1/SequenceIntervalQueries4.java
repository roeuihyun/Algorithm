/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ s ≤ e < arr의 길이
 * 0 ≤ k ≤ 5
 */
public class SequenceIntervalQueries4 {
	
	public static void main(String[] args) {
		
		SequenceIntervalQueries4 run = new SequenceIntervalQueries4();
		
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
		
        for(int result : run.solution(arr,queries)) {
        	System.out.println("result : " + result);
        }
        
	}
	
    public int[] solution(int[] arr, int[][] queries) {
        Arrays.stream(queries)
                .forEach(query -> {
                    IntStream.rangeClosed(query[0], query[1])
                            .filter(i -> i % query[2] == 0)
                            .forEach(i -> arr[i]++);
                });
        return arr;
    }

}
