/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ a ≤ 100
 * 1 ≤ d ≤ 100
 * 1 ≤ included의 길이 ≤ 100
 * included에는 true가 적어도 하나 존재합니다.
 */
public class AddingSpecificTermsArithmeticSequence {
	
	public static void main(String[] args) {
		
		AddingSpecificTermsArithmeticSequence run = new AddingSpecificTermsArithmeticSequence();
		
		int a1 = 3;
		int d1 = 4;
		boolean[] included1 = {true, false, false, true, true};
		
		int a2 = 7;
		int d2 = 1;
		boolean[] included2 = {false, false, false, true, false, false, false};
		
        System.out.println("run.solution(a1,d1,included1) : " + run.solution(a1,d1,included1));
        System.out.println("run.solution(a2,d2,included2) : " + run.solution(a2,d2,included2));
	    
	}
	
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length)
        		.map(index -> {
        			return included[index] ? a + index * d : 0; 
        		})
        		.reduce((x,y) -> x + y)
        		.getAsInt();
    }

}
