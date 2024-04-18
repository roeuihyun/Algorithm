/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Scanner;

/**
 * @author roeuihyun
 * 문제 설명
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 * 제한사항
 * 1 ≤ str의 길이 ≤ 20
 * str은 알파벳으로 이루어진 문자열입니다.
 * 입출력 예 설명
 * 입력 #1
 * aBcDeFg
 * 출력 #1
 * AbCdEfG
 */
public class PrintWithCaseChanged {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(
        		str.chars()
	                .map(ch -> { 
	                	return Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.isLowerCase(ch) ? Character.toUpperCase(ch) : (char) ch ;
	                })
	                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	        		);
        sc.close();
    }

}
