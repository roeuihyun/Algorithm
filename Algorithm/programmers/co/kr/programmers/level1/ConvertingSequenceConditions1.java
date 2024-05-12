/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 배열 arr가 주어집니다. 
 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 
 * 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000,000
 * 1 ≤ arr의 원소의 값 ≤ 100
 */
public class ConvertingSequenceConditions1 {
	
	public static void main(String[] args) {
		
		ConvertingSequenceConditions1 run = new ConvertingSequenceConditions1();
		int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(run.solution(arr));
        for(int i : run.solution(arr)) {
        	System.out.println("result : " + i);
        }
	    
	}
	
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
        			.map(x -> {
        				if(x >= 50 && x % 2 == 0) {
        					return x / 2;
        				} else if(x < 50 && x % 2 != 0) {
        					return x *2;
        				} else {
        					return x;
        				}
        			})
        			.toArray();
    }


}
