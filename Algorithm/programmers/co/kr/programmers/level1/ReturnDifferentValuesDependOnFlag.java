/**
 * 
 */
package co.kr.programmers.level1;

import java.util.function.BiFunction;

/**
 * @author roeuihyun
 * 문제 설명
 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * -1,000 ≤ a, b ≤ 1,000
 */
public class ReturnDifferentValuesDependOnFlag {
	
	public static void main(String[] args) {
		
		ReturnDifferentValuesDependOnFlag run = new ReturnDifferentValuesDependOnFlag();
		System.out.println(run.solution(-4, 7, true));
		System.out.println(run.solution(-4, 7, false));
		for(int i = -1000; i <= 1000 ; i ++) {
			for(int j = -1000; j <= 1000 ; j ++) {
				System.out.println(run.solution(i, j, false));
			}			
		}
	    
	}
	
	public int solution(int a, int b, boolean flag) {
		BiFunction<Integer, Integer, Integer> function1 = (x, y) -> x + y;
		BiFunction<Integer, Integer, Integer> function2 = (x, y) -> x - y;
        return flag ? function1.apply(a,b) : function2.apply(a,b);
    }

}
