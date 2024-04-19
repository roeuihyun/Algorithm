/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.Stream;

/**
 * @author roeuihyun
 * 문제 설명
 * 문자열 myString이 주어집니다. 
 * myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 */
public class ShuffleStrings {
	
	public static void main(String[] args) {
		
		ShuffleStrings run = new ShuffleStrings();
		String str1 = "oxooxoxxox";
		String str2 = "xabcxdefxghi";
		System.out.println(run.solution(str1));
		for( int x : run.solution(str1)) {
			System.out.println(x);
		}
		System.out.println(run.solution(str2));
		for( int x : run.solution(str2)) {
			System.out.println(x);
		}
	    
	}
	
    public int[] solution(String myString) {
        return Stream.of(myString.split("x", -1))
        			.mapToInt(x->x.length()).toArray();
    }

}
