/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
 * a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
 * a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
 * a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
 * 두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * a와 b는 1 이상 6 이하의 정수입니다.
 */
public class DiceGame1 {
	
	public static void main(String[] args) {
		
		DiceGame1 run = new DiceGame1();
		
		int a1 = 3;
		int b1 = 5;
		
		int a2 = 6;
		int b2 = 1;
		
		int a3 = 2;
		int b3 = 4;
		
        System.out.println("run.solution(a1,b1,c1) : " + run.solution(a1,b1));
        System.out.println("run.solution(a2,b2,c2) : " + run.solution(a2,b2));
        System.out.println("run.solution(a3,b3,c3) : " + run.solution(a3,b3));
	    
	}
	
    public int solution(int a, int b) {
    	if(a % 2 != 0 && b % 2 != 0) {
    		return (int) (Math.pow(a, 2) + Math.pow(b, 2)); 
    	}else if( (a % 2 != 0 && b % 2 == 0 ) || 
    			(a % 2 == 0 && b % 2 != 0)) {
    		return 2 * (a + b);
    	}else {
    		return (int) Math.abs(a-b);
    	}
    }

}
