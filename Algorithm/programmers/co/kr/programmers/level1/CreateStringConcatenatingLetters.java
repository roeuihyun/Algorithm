/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author roeuihyun
 * 문제 설명
 * 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. 
 * my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string의 원소는 영소문자로 이루어져 있습니다.
 * 1 ≤ index_list의 길이 ≤ 1,000
 * 0 ≤ index_list의 원소 < my_string의 길이
 */
public class CreateStringConcatenatingLetters {
	
	public static void main(String[] args) {
		
		CreateStringConcatenatingLetters run = new CreateStringConcatenatingLetters();
		
		String my_string1 = "cvsgiorszzzmrpaqpe";
		int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		
		String my_string2 = "zpiaz";
		int[] index_list2 = {1, 2, 0, 0, 3};
		
    	System.out.println("result : " + run.solution(my_string1,index_list1));
    	System.out.println("result : " + run.solution(my_string2,index_list2));
        
	}
	
    public String solution(String my_string, int[] index_list) {
        return Arrays.stream(index_list)
		    		  .mapToObj( index -> {
		    			  return my_string.charAt(index); 
		    		  })
		              .map(String::valueOf)
		              .collect(Collectors.joining());
    }

}
