/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ rny_string의 길이 ≤ 100
 * rny_string은 영소문자로만 이루어져 있습니다.
 */
public class Mystring {
	
	public static void main(String[] args) {
		
		Mystring run = new Mystring();
		
		String my_string1 = "masterpiece";
		String my_string2 = "programmers";
		String my_string3 = "jerry";
		String my_string4 = "burn";
		
        System.out.println(run.solution(my_string1));
        System.out.println(run.solution(my_string2));
        System.out.println(run.solution(my_string3));
        System.out.println(run.solution(my_string4));
	    
	}
	
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }

}
