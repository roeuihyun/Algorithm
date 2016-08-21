package net.acmicpc.unclassified;

import java.util.Scanner;

/**
 * Created by roeuihyun on 2016. 8. 6..
 * 집으로
 * 백은진은 지금 (x, y)에 있고, (0, 0)에 있는 집으로 가능한 빨리 가려고 한다. 백은진은 다음과 같이 두 가지 방법으로 움직일 수 있다.
 * 첫번째 방법은 걷는것이다. 걸을 때는, 1초에 1만큼 움직인다.
 * 두번째 방법은 점프하는 것이다. 점프를 하게 되면, T초에 D만큼 움직인다. 점프는 일직선으로만 할 수 있고, 정확하게 D칸만 움직일 수 있다.
 * 위의 두 가지 방법을 이용해서 백은진이 집에 돌아오는데 걸리는 시간의 최솟값을 구하는 프로그램을 작성하시오.
 * 꼭 한 가지 방법만 사용해야 되는것이 아니고, 두 가지 방법을 적절히 조합해서 가장 빠른 시간을 구하는 것이다.
 * 첫째 줄에 X Y D T가 주어진다. X와 Y는 1,000보다 작거나 같은 자연수이고, D와 T는 10,000보다 작거나 같은 자연수이다.
 * 첫째 줄에 백은진이 집에 돌아오는데 걸리는 시간의 최솟값을 출력한다.
 * 정답과의 차이가 1e-9 이하면 정답이다.
 * 1069번
 */
public class _1069GoHome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String input = sc.nextLine();

            int xPos = Integer.parseInt(input.split(" ")[0]);
            int yPos = Integer.parseInt(input.split(" ")[1]);
            double diagonal = Math.sqrt(Math.pow(xPos,2) + Math.pow(yPos,2));
            int jumpDistance = Integer.parseInt(input.split(" ")[2]);
            int jumpTime = Integer.parseInt(input.split(" ")[3]);
            double totalTime = 0;

            while(true){
                // 좌표 대각선의 길이가 점프 거리보다 작을 때
                if(jumpDistance > diagonal){
                    // 도착 좌표를 뛰어 넘어서 점프했다가 1씩 걸어가는게 걷기만 했을 경우보다 빠를 때
                    if(jumpTime - (diagonal - jumpDistance) < diagonal){
                        totalTime += jumpTime - (diagonal - jumpDistance);
                        System.out.println(totalTime);
                        break;
                    }else{
                        totalTime += diagonal;
                        System.out.println(totalTime);
                        break;
                    }
                }

                // 좌표 대각선의 길이가 점프 거리일 때
                if(jumpDistance == diagonal){
                    totalTime += jumpTime;
                    System.out.println(totalTime);
                    break;
                }

                // 좌표 대각선의 길이가 점프 거리보다 크고 2번 점프할 거리보다 작을 때
                if(jumpDistance < diagonal && 2 * jumpDistance > diagonal){
                    if(diagonal - jumpDistance < jumpTime){
                        totalTime += jumpTime;
                        diagonal -= jumpDistance;
                    }else{
                        totalTime += jumpTime * 2;
                        System.out.println(totalTime);
                        break;
                    }

                }

                // 좌표 대각선의 길이가 점프 2배 거리일 때
                if(2 * jumpDistance == diagonal){
                    System.out.println(jumpTime * 2);
                    break;
                }

                // 2번 점프할 길이보다 큰 경우
                if(2 * jumpDistance < diagonal){
                    totalTime += jumpTime;
                    diagonal -= jumpDistance;
                }

            }

        }

    }

}
