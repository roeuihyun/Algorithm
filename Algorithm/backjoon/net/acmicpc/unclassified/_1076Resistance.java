package net.acmicpc.unclassified;

import java.util.Scanner;

/**
 * Created by roeuihyun on 2016. 7. 23..
 * 전자 제품에는 저항이 들어간다.
 * 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
 * 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
 * 저항의 값은 다음 표를 이용해서 구한다.
 * 색 값 곱
 * black 0 1
 * brown 1 10
 * red 2 100
 * orange 3 1000
 * yellow 4 10000
 * green 5 100000
 * blue 6 1000000
 * violet 7 10000000
 * grey 8 100000000
 * white 9 1000000000
 * 예를 들어, 저항에 색이 yellow, violet, red였다면 저항의 값은 4,700이 된다.
 * 첫째 줄에 첫번째 색, 둘째 줄에 두번째 색, 셋째 줄에 세번째 색이 주어진다. 색은 모두 위의 표에 써 있는 색만 주어진다.
 * 첫째 줄에 입력을 주어진 저항의 저항값을 출력한다.
 * 1076번
 * 반복문
 */
public class _1076Resistance {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String color[][] = {{"black","brown","red","orange","yellow","green","blue","violet","grey","white"},
                            {"1","10","100","1000","10000","100000","1000000","10000000","100000000","1000000000"}};
        int colorIndex[] = new int[3];
        for(int i = 0; i < 3; i ++){
            String inputColor = sc.nextLine();
            for(int j = 0; j < 10; j++){
                if(inputColor.trim().equals(color[0][j])){
                    colorIndex[i] = j;
                }
            }
        }
        System.out.println( (Long.parseLong(Integer.toString(colorIndex[0]) + Integer.toString(colorIndex[1])) * Long.parseLong(color[1][colorIndex[2]])) );
    }

}