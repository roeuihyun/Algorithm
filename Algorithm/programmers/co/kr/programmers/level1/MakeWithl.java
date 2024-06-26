/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.Collectors;

/**
 * @author roeuihyun
 * 문제 설명
 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ myString ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 */
public class MakeWithl {
	
	public static void main(String[] args) {
		
		MakeWithl run = new MakeWithl();
		String myString1 = "abcdevwxyz";
		String myString2 = "jjnnllkkmm";
		System.out.println(run.solution(myString1));
		System.out.println(run.solution(myString2));
	}
	
    public String solution(String myString) {
        return myString.chars()
        				.mapToObj(c -> (char) c < 'l' ? 'l' : (char)c)
        				.map(String::valueOf)
		                .collect(Collectors.joining());
    }

}
