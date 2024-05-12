/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 
 * return하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ num_list의 길이 ___
 */
public class UpToTheNthElement {
	
	public static void main(String[] args) {
		
		UpToTheNthElement run = new UpToTheNthElement();
		int[] num_list1 = {2, 1, 6};
		int[] num_list2 = {5, 2, 1, 7, 5};
		
//        System.out.println(run.solution(num_list1,12));
        
        for(int i : run.solution(num_list1,1)) {
        	System.out.println("result1 : " + i);
        }
        
//        System.out.println(run.solution(num_list2,3));
        
        for(int i : run.solution(num_list2,3)) {
        	System.out.println("result2 : " + i);
        }
	    
	}
	
//    public String[] solution(String[] names) {
//        return IntStream.range(0, names.length)
//        				.filter(index -> index % 5 == 0)
//        				.mapToObj(index -> names[index])
//        				.toArray(String[]::new);
//    }
    
//    public int[] solution(int[] num_list, int n) {
//        return IntStream.range(0, num_list.length)
//						.filter(index -> index % n == 0)
//						.map(index -> num_list[index])
//						.toArray();
//    }
	
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, n)
        				.map(index -> num_list[index])
        				.toArray();
    }

}
