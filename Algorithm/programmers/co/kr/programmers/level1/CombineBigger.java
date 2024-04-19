/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 * 제한사항
 * 1 ≤ a, b < 10,000
 */
public class CombineBigger {
	
	public static void main(String[] args) {
		
		CombineBigger run = new CombineBigger();
		int a1 = 9;
		int b1 = 91;
		int a2 = 8;
		int b2 = 89;
		int a3 = 8;
		int b3 = 8;
        System.out.println(run.solution(a1,b1));
        System.out.println(run.solution(a2,b2));
        System.out.println(run.solution(a3,b3));
	    
	}
	
    public int solution(int a, int b) {
        int firstMix = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int secondMix = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return Integer.compare(firstMix, secondMix) == 1 ? firstMix : secondMix;
    }

}
