/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 3 ≤ num_str ≤ 100
 * 입출력 예 설명
 * 입출력 예 #1
 * 문자열 안의 모든 숫자를 더하면 45가 됩니다.
 * 입출력 예 #2
 * 문자열 안의 모든 숫자를 더하면 1이 됩니다.
 */
public class SumOfStringIntegers {
	
	public static void main(String[] args) {
		SumOfStringIntegers convertToString = new SumOfStringIntegers();
	    for(int i = 3; i <= 100; i++) {
	        System.out.println(convertToString.solution(""+i));
	    }
	}
	
    public int solution(String num_str) {
        return num_str.chars() // 문자열을 int 스트림으로 변환
                .map(Character::getNumericValue) // 각 문자를 정수로 변환
                .reduce(0, Integer::sum); // 합을 구함
    }

}
