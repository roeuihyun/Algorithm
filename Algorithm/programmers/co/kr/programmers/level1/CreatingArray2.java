/**
 * 
 */
package co.kr.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 
 * 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 * 제한사항
 * 1 ≤ l ≤ r ≤ 1,000,000
 */
public class CreatingArray2 {
	
	public static void main(String[] args) {
		
		CreatingArray2 run = new CreatingArray2();
		
		int l1 = 5;
		int r1 = 555;
		int l2 = 10;
		int r2 = 20;
		
        for(int result : run.solution(l1,r1)) {
        	System.out.println("result : " + result);
        }
        
        for(int result : run.solution(l2,r2)) {
        	System.out.println("result : " + result);
        }
        
	}
	
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        IntStream.range(l, r + 1)
        		.forEach( i -> {
                    if (String.valueOf(i).chars().allMatch(ch -> ch == '0' || ch == '5')) {
                        result.add(i);
                    }
        		});

        return result.isEmpty() ? new int[]{-1} : result.stream().mapToInt(Integer::intValue).toArray();
    }

}
