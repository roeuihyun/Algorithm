/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 1 ≤ n_str ≤ 5
 * n_str은 0부터 9까지의 정수 문자로만 이루어져 있습니다.
 * 입출력 예 설명
 * 입출력 예 #1
 * "10"을 정수로 바꾸면 10입니다.
 * 입출력 예 #2
 * "8542"를 정수로 바꾸면 8542입니다.
 */
public class ConvertStringToInteger {
	
	public static void main(String[] args) {
		ConvertStringToInteger convertToString = new ConvertStringToInteger();
	    for(int i = 0; i <= 99999; i++) {
	        System.out.println(convertToString.solution(""+i));
	    }
	}
	
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

}
