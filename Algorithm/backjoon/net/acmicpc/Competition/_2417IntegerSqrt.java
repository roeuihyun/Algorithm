package net.acmicpc.Competition;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by roeuihyun on 2016. 8. 11..
 * 정수 제곱근
 * 정수가 주어지면, 그 수의 정수 제곱근을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수 n이 주어진다. (0<=n<2^63)
 * 첫째 줄에 q^2 >= n인 가장 작은 음이 아닌 정수 q를 출력한다.
 * 2417번
 * Olympiad > Baltic Olympiad in Informatics > BOI 2006 0번
 */
public class _2417IntegerSqrt {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger input = new BigInteger(sc.nextLine());
        BigInteger sqrtResult = sqrt(input);
        if(sqrtResult.pow(2).doubleValue() > input.doubleValue()){
            sqrtResult = sqrtResult.add(new BigInteger("1").negate());
        }
        System.out.println(sqrtResult );

    }

    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }

}
