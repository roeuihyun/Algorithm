package net.acmicpc.Competition;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-31.
 * 성적 통계
 * 한상덕은 이번에 중덕 고등학교에 새로 부임한 교장 선생님이다.
 * 교장 선생님으로서 첫 번째 일은 각 반의 수학 시험 성적의 통계를 내는 일이다.
 * 중덕 고등학교 각 반의 학생들의 수학 시험 성적이 주어졌을 때, 최대 점수, 최소 점수, 점수 차이를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 중덕 고등학교에 있는 반의 수 K (1 ≤ K ≤ 100)가 주어진다. 다음 K개 줄에는 각 반의 학생수 N (2 ≤ N ≤ 50)과 각 학생의 수학 성적이 주어진다.
 * 시험 성적은 0보다 크거나 같고, 100보다 작거나 같은 정수이고, 공백으로 나누어져 있다.
 * 각 반에 대한 출력은 다음과 같이 두 줄로 이루어져 있다.
 * 첫째 줄에는 "Class X"를 출력한다. X는 반의 번호이며 입력으로 주어진 순서대로 1부터 증가한다.
 * 둘째 줄에는 가장 높은 점수, 낮은 점수, 성적을 내림차순으로 정렬했을 때 가장 큰 인접한 점수 차이를 예제 출력과 같은 형식으로 출력한다.
 * 5800번
 * ACM-ICPC > Regionals > South Pacific > South Pacific Region > 2011 ACM South Pacific Programming Contest A번
 */
public class _5800ScoreStatistics {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int classCount = Integer.parseInt(sc.nextLine());
        int largestGap;
        for(int i = 0; i < classCount; i ++){
            String[] classScoreLine = sc.nextLine().split(" ");
            int[] classScore = new int[Integer.parseInt(classScoreLine[0])];
            for(int j = 0; j < classScore.length ; j++){
                classScore[j] = Integer.parseInt(classScoreLine[j + 1]);
            }
            largestGap = 0;
            Arrays.sort(classScore);
            for(int j = 0; j < classScore.length - 1; j ++){
                if(Math.abs(classScore[j] - classScore[j + 1] ) > largestGap){
                    largestGap = Math.abs( classScore[j] - classScore[j + 1] );
                }
            }
            System.out.println("Class " + (i + 1));
            System.out.println("Max " +  classScore[classScore.length - 1] + ", Min " + classScore[0] + ", Largest gap " + largestGap);
        }

    }

}
