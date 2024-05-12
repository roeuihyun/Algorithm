/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 
 * 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 
 * 두 값이 같을 경우 그 값을 return합니다.
 * 제한사항
 * 5 ≤ num_list의 길이 ≤ 50
 * -9 ≤ num_list의 원소 ≤ 9
 */
public class OddVsEven {
	
	public static void main(String[] args) {
		
		OddVsEven run = new OddVsEven();
		
		int[] num_list1 = {4, 2, 6, 1, 7, 6};
		int[] num_list2 = {-1, 2, 5, 6, 3};
		
    	System.out.println("result : " + run.solution(num_list1));
    	System.out.println("result : " + run.solution(num_list2));
        
	}
	
    public int solution(int[] num_list) {
        Map<Boolean, Integer> groupSum = IntStream.range(0, num_list.length)
                                    .boxed()
                                    .collect(Collectors.groupingBy(
                                        x -> x % 2 == 0,
                                        Collectors.summingInt(x -> num_list[x])
                                    ));
        return Math.max(groupSum.getOrDefault(true, 0), groupSum.getOrDefault(false, 0));
    }

}
