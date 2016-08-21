package net.acmicpc.sorting;

import java.util.*;

/**
 * Created by Administrator on 2016-08-21.
 * N개의 정수가 주어진다. 이 때, N개의 정수를 오름차순으로 정렬하는 프로그램을 작성하시오. 같은 정수는 한 번만 출력한다.
 * 첫째 줄에 수의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째에는 숫자가 주어진다. 이 수는 절대값이 1,000보다 작거나 같은 정수이다.
 * 첫째 줄에 수를 오름차순으로 정렬한 결과를 출력한다. 이 때, 같은 수는 한 번만 출력한다.
 * sorting
 * 10867번
 */
public class _10867UniqueSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integerCount = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < integerCount; i ++){
            list.add(sc.nextInt());
        }
        List<Integer> uniqueList = new ArrayList<Integer>(new HashSet<Integer>(list));
        Collections.sort(uniqueList);
        for(int i = 0; i < uniqueList.size(); i++){
            System.out.print(uniqueList.get(i) + " ");
        }
    }

}
