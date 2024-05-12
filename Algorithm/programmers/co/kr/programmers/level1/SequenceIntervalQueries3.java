/**
 * 
 */
package co.kr.programmers.level1;

/**
 * @author roeuihyun
 * 문제 설명
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ i < j < arr의 길이
 */
public class SequenceIntervalQueries3 {
	
	public static void main(String[] args) {
		
		SequenceIntervalQueries3 run = new SequenceIntervalQueries3();
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1, 2},{1, 4}};
		
        for(int result : run.solution(arr,queries)) {
        	System.out.println("result : " + result);
        }
        
	}
	
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length ; i ++) {
        	int temp = arr[queries[i][0]];
        	arr[queries[i][0]] = arr[queries[i][1]];
        	arr[queries[i][1]] = temp;
        }
        return arr;
    }

}