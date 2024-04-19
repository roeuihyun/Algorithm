/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.Stream;

/**
 * @author roeuihyun
 * 문제 설명
 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 200
 * arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
 */
public class ConvertingListOfCharactersToString {
	
	public static void main(String[] args) {
		
		ConvertingListOfCharactersToString run = new ConvertingListOfCharactersToString();
		String[] my_string1 = {"a","b","c"};
        System.out.println(run.solution(my_string1));
	    
	}
	
	public String solution(String[] arr) {
	    return Stream.of(arr)
	            .reduce((x,y) -> x+y)
	            .get();
	}


}
