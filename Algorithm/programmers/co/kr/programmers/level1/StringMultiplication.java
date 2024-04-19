/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string은 영소문자로만 이루어져 있습니다.
 * 1 ≤ k ≤ 100
 */
public class StringMultiplication {
	
	public static void main(String[] args) {
		
		StringMultiplication run = new StringMultiplication();
		String my_string1 = "string";
		int k1 = 3;
		System.out.println(run.solution(my_string1, k1));
		String my_string2 = "love";
		int k2 = 10;
		System.out.println(run.solution(my_string2, k2));
	    
	}
	
	public String solution(String my_string, int k) {
		return IntStream.range(0, k).mapToObj(i -> {return my_string;}).collect(Collectors.joining());
	}


}
