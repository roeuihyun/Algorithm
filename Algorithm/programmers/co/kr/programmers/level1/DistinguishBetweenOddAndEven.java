/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 * 제한사항
 * 1 ≤ n ≤ 1,000
 * 입출력 예 설명
 * 입력 #1
 * 100
 * 출력 #1
 * 100 is even
 * 입력 #2
 * 1
 * 출력 #2
 * 1 is odd
 */
public class DistinguishBetweenOddAndEven {
	
    public static void main(String[] args) {
    	
    	DistinguishBetweenOddAndEven run = new DistinguishBetweenOddAndEven();
		System.out.println(run.solution("He11oWor1d","lloWorl",2));
		System.out.println(run.solution("Program29b8UYP","merS123",7));
	    
    }
    
    public String solution(String my_string, String overwrite_string, int s) {
        return IntStream.range(0, my_string.length())
                .mapToObj(i -> i >= s && i < s + overwrite_string.length() ? String.valueOf(overwrite_string.charAt(i-s)) : String.valueOf(my_string.charAt(i)))
                .collect(Collectors.joining());
    }

}
