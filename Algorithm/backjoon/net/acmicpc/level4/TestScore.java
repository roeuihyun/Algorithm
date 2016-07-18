/**
 * 
 */
package net.acmicpc.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author roeuihyun
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 시험 성적을 출력한다.
 * 9498번
 * 출력
 */
public class TestScore {
	
	public static void main(String[] args) {
		final char[] score = {'A','B','C','D','F'};
		try {
			int input = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			if(input >= 90 && input <= 100){
				System.out.println(score[0]);
			}else if(input >= 80 && input <= 89){
				System.out.println(score[1]);
			}else if(input >= 70 && input <= 79){
				System.out.println(score[2]);
			}else if(input >= 60 && input <= 69){
				System.out.println(score[3]);
			}else{
				System.out.println(score[4]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
