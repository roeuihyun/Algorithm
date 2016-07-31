package net.acmicpc.unclassified;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-31.
 * 알파벳 대문자로 구성되어있는 문자열 S가 주어졌을 때, S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 구하는 프로그램을 작성하시오.
 * 문자열 S가 “ABCDEFGHIJKLMNOPQRSTUVW” 일 때, S에 등장하지 않는 알파벳 대문자는 X, Y, Z이다.
 * X의 아스키 코드 값은 88, Y는 89, Z는 90이므로 이 아스키 코드 값의 합은 267이다.
 * 알파벳 대문자의 아스키 코드 값은 다음과 같다.
 * 입력은 T개의 테스트 데이터로 구성된다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
 * 각 테스트 데이터는 한 줄로 구성되어 있고,
 * 문자열 S가 주어진다.
 * S는 알파벳 대문자로만 구성되어 있고, 최대 1000글자이다.
 * 각 테스트 데이터에 대해, 입력으로 주어진 문자열 S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 한 줄에 하나씩 출력한다.
 * 3059번
 * 출력
 */
public class _3059CharAppearance {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;
        for(int i = 65; i <= 90; i++){
            totalSum += i;
        }
        int loopCount = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < loopCount; i++){
            char sChar[] = sc.nextLine().toCharArray();
            int totalSumCheck = 0;
            HashSet hs = new HashSet();
            for(int j = 0; j < sChar.length; j++){
                hs.add(sChar[j]);
            }
            Iterator it = hs.iterator();
            while (it.hasNext()){
                totalSumCheck += (char)it.next();
            }

            System.out.println(totalSum - totalSumCheck);
        }
    }

}
