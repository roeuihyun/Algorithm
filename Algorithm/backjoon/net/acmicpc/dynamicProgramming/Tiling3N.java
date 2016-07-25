/**
 * 
 */
package net.acmicpc.dynamicProgramming;

import java.util.Scanner;

/**
 * @author roeuihyun
 * 2×N 크기의 벽을 2×1(그리고 1×2) 크기의 타일로 채우는 경우의 수를 구하는 문제는 쉽다.
 * 그렇다면 3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
 * 첫째 줄에 N(1≤N≤30)이 주어진다.
 * 첫째 줄에 경우의 수를 출력한다.
 * 2133번
 * 다이나믹 프로그래밍
 */
class Tiling3N {

    public static void main(String[] args) {
        System.out.println(new Tiling3N().tiling(new Scanner(System.in).nextInt()));
    }

    /*iterative solution
    public int tiling(int n) {
        if (n % 2 != 0) return 0;
        int answer = 1;
        int val = 1;
        for (int i = 0; i < n / 2; i++) {
            answer = (2 * val + answer) % 100000;
            val = (answer + val) % 100000;
        }
        return answer;
    }*/

    // recursive solution
    public int tiling(int n) {
        if (n % 2 != 0) return 0;
        if (n == 0) return 1;
        return (tiling(n - 2) + 2 * tiling2(n - 1)) % 100000;
    }

    private int tiling2(int n) {
        if (n % 2 == 0) return 0;
        if (n == 1) return 1;
        return (tiling(n - 1) + tiling2(n - 2)) % 100000;
    }

}