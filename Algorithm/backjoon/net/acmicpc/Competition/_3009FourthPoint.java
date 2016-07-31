package net.acmicpc.Competition;

import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-31.
 * 네번째 점
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 * 직사각형의 네번째 점의 좌표를 출력한다.
 * 3009번
 * Contest > Croatian Open Competition in Informatics > COCI 2007/2008 > Contest #1 1번
 */
public class _3009FourthPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xPosition = 0;
        int yPosition = 0;
        for(int i = 0; i < 3; i ++){
            int inputX = sc.nextInt();
            int inputY = sc.nextInt();
            xPosition ^= inputX;
            yPosition ^= inputY;
        }
        System.out.println(xPosition + " " + yPosition);
    }

}
