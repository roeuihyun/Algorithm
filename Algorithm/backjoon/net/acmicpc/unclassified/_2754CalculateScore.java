package net.acmicpc.unclassified;

import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-31.
 * 학점계산
 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
 * A+: 4.3, A0: 4.0, A-: 3.7
 * B+: 3.3, B0: 3.0, B-: 2.7
 * C+: 2.3, C0: 2.0, C-: 1.7
 * D+: 1.3, D0: 1.0, D-: 0.7
 * F: 0.0
 * 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.
 * 첫째 줄에 C언어 평점을 출력한다.
 * 2754번
 * 출력
 */
public class _2754CalculateScore {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double[] scoreNumber = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        final String[] scoreCharacter = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        String inputScore = sc.nextLine();
        for(int i = 0; i < scoreCharacter.length ; i ++){
            if(inputScore.equals(scoreCharacter[i])){
                System.out.print(scoreNumber[i]);
            }
        }
    }

}
