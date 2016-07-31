/**
 * 
 */
package net.acmicpc.dynamicProgramming;

import java.util.Scanner;

/**
 * @author roeuihyun
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
 * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 
 * 집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 
 * 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다.
 * 첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.
 * 1149번
 * 다이나믹 프로그래밍
 */
public class _1149RGBDistance {
	
	public static void main(String[] args) {
		_1149RGBDistance rgb = new _1149RGBDistance();
		Scanner sc = new Scanner(System.in);
		int houseCount = sc.nextInt();
		int rgbArray[][] = new int[houseCount][3];
		for(int i = 0; i < houseCount; i++){
			for(int j = 0; j < 3; j ++){
				rgbArray[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(rgb.rgbDistance(rgbArray, houseCount));
	}
	
    public int rgbDistance(int[][] rgbArray, int size) {
        return rgbDistance(rgbArray, size, 0, -1);
    }

    private int rgbDistance(int[][] rgbArray, int size, int y, int idx) {
      if (y >= size) return 0;
      int answer = Integer.MAX_VALUE;
      for (int i = 0; i < 3; i++) {
        if (i != idx) {
          answer = Math.min(rgbDistance(rgbArray, size, y + 1, i) + rgbArray[y][i], answer);
        }
      }
      return answer;
    }
	
}
