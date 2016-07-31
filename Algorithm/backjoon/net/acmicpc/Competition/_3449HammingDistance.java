package net.acmicpc.Competition;

import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-31.
 * 해밍거리
 * 해밍 거리란 두 숫자의 서로 다른 자리수의 개수이다.
 * 두 이진수가 주어졌을 때, 해밍 거리를 계산하는 프로그램을 작성하시오.
 * 입력을 여러 개의 테스트 케이스로 이루어져 있다. 첫째 줄에는 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 두 줄로 이루어져 있다.
 * 각 줄에는 이진수가 하나씩 주어진다.
 * 두 이진수는 길이가 서로 같고, 100자리를 넘지 않는다.
 * 각 테스트 케이스에 대해서, 해밍 거리를 계산한 뒤, "Hamming distance is X."라고 출력한다. X는 해밍 거리이다.
 * 3449번
 * ACM-ICPC > Regionals > Europe > Central European Regional Contest > CERC 2007 PD번
 */
public class _3449HammingDistance {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loopCount = Integer.parseInt(sc.nextLine());
        int hammingDistance = 0;
        for(int i = 0; i < loopCount; i ++){
            char[] firstBinary = sc.nextLine().toCharArray();
            char[] secondBinary = sc.nextLine().toCharArray();
            hammingDistance = 0;
            for(int j = 0; j < firstBinary.length ; j ++){
                if(firstBinary[j] != secondBinary[j]){
                    hammingDistance++ ;
                }
            }
            System.out.println("Hamming distance is "+hammingDistance + ".");
        }
    }

}
