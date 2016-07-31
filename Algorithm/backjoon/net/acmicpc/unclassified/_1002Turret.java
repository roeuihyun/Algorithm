/**
 * 
 */
package net.acmicpc.unclassified;

import java.util.Scanner;

/**
 * @author roeuihyun
 * 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다.
 * 다음은 조규현과 백승환의 사진이다.
 * 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다.
 * 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
 * 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 다음과 같이 구성되어있다.
 * 첫째 줄에 x1, y1, r1, x2, y2, r2가 주어진다.
 * x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
 * 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
 * 1002번
 * 미분류
 */
public class _1002Turret {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int turretCount = sc.nextInt();
        double pointDistance = 0;
        double radius = 0;
        int tr[][] = new int[turretCount][6];
        for(int i = 0; i < turretCount; i++){
            for(int j = 0; j < 6; j ++){
                tr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < turretCount; i++){

            pointDistance = Math.sqrt( Math.pow(tr[i][0] - tr[i][3],2) + Math.pow(tr[i][1] - tr[i][4],2) );
            radius = tr[i][2] + tr[i][5];

            //두 원이 완전히 일치하는 경우
            if(tr[i][0] == tr[i][3] && tr[i][1] == tr[i][4] && tr[i][2] == tr[i][5]){
                System.out.print(-1 + " ");
                continue;
            }

            //두 원이 완전히 접하지 않는 경우
            if(( pointDistance + tr[i][2] < tr[i][5] )|| ( pointDistance + tr[i][5] < tr[i][2] ) || pointDistance > radius){
                System.out.print(0 + " ");
                continue;
            }

            //두 원이 한번만 접하는 경우
            if(pointDistance == radius || pointDistance + tr[i][2] == tr[i][5] || pointDistance + tr[i][5] == tr[i][2]){
                System.out.print(1 + " ");
                continue;
            }

            //두 원이 2개의 점이 접하는 경우
            if(pointDistance < radius ){
                System.out.print(2 + " ");
            }

        }

    }

}
