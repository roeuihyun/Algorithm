/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ n ≤ 100
 */
public class ReturningDifferentValuesDependOddOrEven {
	
	public static void main(String[] args) {
		
		ReturningDifferentValuesDependOddOrEven run = new ReturningDifferentValuesDependOddOrEven();
		int n1 = 7;
		int n2 = 10;
        System.out.println(run.solution(n1));
        System.out.println(run.solution(n2));
	    
	}
	
    public int solution(int n) {
        return n % 2 == 0 ? IntStream.rangeClosed(1, n)
					                .filter(x -> x % 2 == 0)
					                .map(x -> (int)(Math.pow(x, 2)) )
					                .sum() : 
					        IntStream.rangeClosed(1, n)
					        		.filter(x -> x % 2 != 0)
					        		.sum();
    }

}
