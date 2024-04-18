/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * 문제에서 정의한 배열의 대소관계가 일반적인 프로그래밍 언어에서 정의된 배열의 대소관계와 다를 수 있는 점에 유의해주세요.
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 my_string은 "programmers"이고 alp가 "p"이므로 my_string에 모든 p를 대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.
 * 입출력 예 #2
 * 예제 2번의 alp는 "x"이고 my_string에 x는 없습니다. 따라서 "lowercase"를 return 합니다.
 */
public class ChangeSpecificLettersToUppercase {
	
    public static void main(String[] args) {
    	
    	ChangeSpecificLettersToUppercase run = new ChangeSpecificLettersToUppercase();
		System.out.println(run.solution("programmers","p"));
		System.out.println(run.solution("lowercase","x"));
	    
    }
    
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

}
