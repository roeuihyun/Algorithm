/**
 * 
 */
package co.kr.programmers.level1;

import java.util.Arrays;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 */
public class MultiplicationSumOfElements {
	
	public static void main(String[] args) {
		
		MultiplicationSumOfElements run = new MultiplicationSumOfElements();
		
		int[] num_list1 = {3, 4, 5, 2, 1};
		int[] num_list2 = {5, 7, 8, 3};
		
        System.out.println("run.solution(num_list1) : " + run.solution(num_list1));
        System.out.println("run.solution(num_list2) : " + run.solution(num_list2));
	    
	}
	
    public int solution(int[] num_list) {
    	
        int productOfAllElements = Arrays.stream(num_list)
                .reduce(1, (product, num) -> product * num);

        int sumOfAllElements = Arrays.stream(num_list).sum();

        return productOfAllElements < sumOfAllElements * sumOfAllElements ? 1 : 0;
    }

}
