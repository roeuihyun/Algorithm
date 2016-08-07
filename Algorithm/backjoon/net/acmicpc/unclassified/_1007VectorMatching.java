package net.acmicpc.unclassified;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016-08-02.
 * Vector Matching
 * 평면 상에 N개의 점이 찍혀있고, 그 점을 집합 P라고 하자.
 * 집합 P의 Vector Matching은 벡터의 집합인데, 모든 벡터는 집합 P 중 한 점에서 시작해서, 또 다른 점에서 끝나는 벡터들의 집합이다.
 * 또, P속의 모든 점은 모두 단 한번만 쓰여야 한다.
 * V에 있는 벡터의 개수는 P에 있는 점의 절반이다.
 * 평면 상의 점이 주어졌을 때, 집합 P의 Vector Matching에 있는 벡터들의 합의 길이의 최소값을 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 구성되어있다.
 * 첫째 줄에 점의 개수 N이 주어진다. N은 짝수이다.
 * 둘째 줄부터 N개의 줄에 점의 좌표가 주어진다.
 * N은 20보다 작거나 같은 자연수이고, 좌표는 절댓값이 100,000보다 작거나 같은 정수다. 모든 점은 서로 다르다.
 * 각 테스트 케이스 마다 소수점 7자리에서 반올림하여 정답을 출력한다. (구한 답이 0이어도 0.000000 을 출력해야 한다.)
 * 다음과 같이 작성하면 소수점 7자리에서 반올림하여 출력한다. double f = 1.234; printf(“%.6lf\n”, f); // 1.234000 을 출력한다.
 * 1007번
 * 출력
 */
public class _1007VectorMatching {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < testCase; i ++){
            int pointCount = Integer.parseInt(sc.nextLine().trim());
            double vectorPoint[][] = new double[pointCount][2];
            for(int j = 0 ; j < pointCount; j ++){
                String inputOneLine = sc.nextLine().trim();
                vectorPoint[j][0] = Double.parseDouble(inputOneLine.split(" ")[0]);
                vectorPoint[j][1] = Double.parseDouble(inputOneLine.split(" ")[1]);
            }
            double vector[][] = new double[pointCount][2];
            for(int j = 0 ; j < pointCount/2; j ++){
                vector[2 * j][0] = - vectorPoint[2 * j][0] + vectorPoint[2 * j +1][0];
                vector[2 * j][1] = - vectorPoint[2 * j][1] + vectorPoint[2 * j +1][1];
            }

            double vectorTotal[] = new double[2];
            for(int j = 0 ; j < pointCount/2; j ++){
                if(pointCount >= 4){
                    vectorTotal[0] = Math.min(Math.min(Math.abs(vector[2 * j][0] + vector[2 * j + 1][0]), Math.abs(vector[2 * j][0] - vector[2 * j + 1][0])), Math.min(Math.abs(-vector[2 * j][0] + vector[2 * j + 1][0]), Math.abs(-vector[2 * j][0] - vector[2 * j + 1][0]) ));
                    vectorTotal[1] = Math.min(Math.min(Math.abs(vector[2 * j][1] + vector[2 * j + 1][1]), Math.abs(vector[2 * j][1] - vector[2 * j + 1][1])), Math.min(Math.abs(-vector[2 * j][1] + vector[2 * j + 1][1]), Math.abs(-vector[2 * j][1] - vector[2 * j + 1][1]) ));
                }else{
                    vectorTotal[0] += vector[j][0];
                    vectorTotal[1] += vector[j][1];
                }
            }
            System.out.printf("%.6f", Math.round(Math.sqrt((Math.pow(vectorTotal[0],2) + Math.pow(vectorTotal[1],2))) * 1000000d)/1000000d );
            System.out.println("");
        }

    }

}
