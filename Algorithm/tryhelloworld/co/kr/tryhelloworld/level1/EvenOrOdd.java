/**
 * 
 */
package co.kr.tryhelloworld.level1;

/**
 * @author roeuihyun
 * http://tryhelloworld.co.kr/의 알고리즘 문제 Level1
 * evenOrOdd 메소드는 int형 num을 매개변수로 받습니다.
 * num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하도록 evenOrOdd에 코드를 작성해 보세요.
 * num은 0이상의 정수이며, num이 음수인 경우는 없습니다.
 */
public class EvenOrOdd {
	
    String evenOrOdd(int num) {
        String result = "";
        if ( (num & 1) == 0 ) {
        	result = "Even"; 
        } else { 
        	result = "Odd";
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
    }
    
}
