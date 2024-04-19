/**
 * 
 */
package co.kr.programmers.level1;

import java.util.stream.IntStream;

/**
 * @author roeuihyun
 * 문제 설명
 * n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때, arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
 * 0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
 * 제한사항
 * 1 ≤ arr의 길이 = arr의 원소의 길이 ≤ 100
 * 1 ≤ arr의 원소의 원소 ≤ 1,000
 * 모든 arr의 원소의 길이는 같습니다.
 */
public class SpecialTwoDimensionalArray2 {
	
	public static void main(String[] args) {
		
		SpecialTwoDimensionalArray2 run = new SpecialTwoDimensionalArray2();
		int[][] arr1 = {{5,192,33},{192,72,95},{33,95,999}};
		int[][] arr2 = {{19,498,258,587},{63,93,7,754},{258,7,1000,723},{587,754,723,81}};
		System.out.println(run.solution(arr1));
		System.out.println(run.solution(arr2));
	    
	}
	
    public int solution(int[][] arr) {
        return IntStream.range(0, arr.length)
                .allMatch(i -> IntStream.range(0, arr[i].length)
                                        .allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;
    }

}
