/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 
 * 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * (x1 ∨ x2) ∧ (x3 ∨ x4)
 */
public class SimpleLogicalOperations {
	
	public static void main(String[] args) {
		
		SimpleLogicalOperations run = new SimpleLogicalOperations();
		
		boolean x1_1 = false;
		boolean x2_1 = true;
		boolean x3_1 = true;
		boolean x4_1 = true;
		
		boolean x1_2 = true;
		boolean x2_2 = false;
		boolean x3_2 = false;
		boolean x4_2 = false;
		
    	System.out.println("result : " + run.solution(x1_1,x2_1,x3_1,x4_1));
    	System.out.println("result : " + run.solution(x1_2,x2_2,x3_2,x4_2));
        
	}
	
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 | x2) & (x3 | x4) ;
    }

}
