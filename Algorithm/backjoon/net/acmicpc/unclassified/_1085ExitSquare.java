package net.acmicpc.unclassified;

import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-23.
 * 한수는 지금 (x, y)에 있다.
 * 직사각형의 왼쪽 아래 꼭지점은 (0, 0)에 있고, 오른쪽 위 꼭지점은 (w, h)에 있다.
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 x y w h가 주어진다.
 * w와 h는 1,000보다 작거나 같은 자연수이고,
 * x는 1보다 크거나 같고,
 * w-1보다 작거나 같은 자연수이고,
 * y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
 * 첫째 줄에 문제의 정답을 출력한다.
 * 1085번
 * 조건문
 */
public class _1085ExitSquare {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[4];
        int xDistance, yDsitance;
        for(int i = 0; i < 4; i ++){
            input[i] = sc.nextInt();
        }
        xDistance = (input[2] - input[0]) > input[0] ? input[0] : input[2] - input[0];
        yDsitance = (input[3] - input[1]) > input[1] ? input[1] : input[3] - input[1];

        System.out.println(xDistance > yDsitance ? yDsitance : xDistance);
    }

}
