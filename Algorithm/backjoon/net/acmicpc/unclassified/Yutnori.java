package net.acmicpc.unclassified;

import java.util.Scanner;

/**
 * Created by roeuihyun on 2016. 7. 27..
 * 우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정한다.
 * 네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때
 * 도(배 한 개, 등 세 개),
 * 개(배 두 개, 등 두 개),
 * 걸(배 세 개, 등 한 개),
 * 윷(배 네 개),
 * 모(등 네 개)
 * 중 어떤 것인지를 결정하는 프로그램을 작성하라.
 * 첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가  빈칸을 사이에 두고 주어진다.
 * 첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를  도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력 한다.
 * 2490번
 * Olympiad > 한국정보올림피아드시․도지역본선 > 지역본선 2009 > 초등부 1번 출력 반복문
 */
public class Yutnori {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char yutnori[] = {'A','B','C','D','E'};
        int yutnoriIndex = 0;
        for(int i = 0; i < 3; i++){
            yutnoriIndex = 0;
            for(int j = 0; j < 4; j++){
                yutnoriIndex += sc.nextInt();
            }
            if(yutnoriIndex == 4){
                System.out.println(yutnori[4]);
            }else {
                System.out.println(yutnori[3-yutnoriIndex]);
            }
        }

    }

}
