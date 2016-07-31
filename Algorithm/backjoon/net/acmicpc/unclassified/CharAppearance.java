package net.acmicpc.unclassified;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Administrator on 2016-07-31.
 */
public class CharAppearance {

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
