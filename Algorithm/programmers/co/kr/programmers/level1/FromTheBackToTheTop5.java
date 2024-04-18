/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 6 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 100
 * 입출력 예 설명
 * 입출력 예 #1
 * [12, 4, 15, 46, 38, 1, 14]를 정렬하면 [1, 4, 12, 14, 15, 38, 46]이 되고, 앞에서 부터 5개를 고르면 [1, 4, 12, 14, 15]가 됩니다.
 */
public class FromTheBackToTheTop5 {
	
	public static void main(String[] args) {
		
		FromTheBackToTheTop5 run = new FromTheBackToTheTop5();
		int[] input = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] output = run.solution(input);
	    for(int i = 0; i <= output.length -1 ; i++) {
	        System.out.println(output[i]);
	    }
        
	}
	
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .sorted() // 오름차순 정렬
                .limit(5) // 처음 5개 요소를 건너뜀
                .toArray(); // 배열로 변환하여 반환
    }

}
