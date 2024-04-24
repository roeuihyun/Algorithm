/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 배열 arr와 자연수 k가 주어집니다.
 * 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
 * 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000,000
 * 1 ≤ arr의 원소의 값 ≤ 100
 * 1 ≤ k ≤ 100
 */
public class ConvertingSequenceConditions3 {
	
	public static void main(String[] args) {
		
		ConvertingSequenceConditions3 run = new ConvertingSequenceConditions3();
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		int[] arr2 = {1, 2, 3, 100, 99, 98};
        
		for(int each : run.solution(arr1,3)) {
			System.out.println(each);
		}
		
		for(int each : run.solution(arr2,2)) {
			System.out.println(each);
		}	
	    
	}
	
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(factor -> k % 2 == 0 ? factor + k : factor * k ).toArray();
    }

}
