package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * Set<Integer> lotto = new HashSet<Integer>();
		 * 
		 * for (int i = 0; lotto.size() < 6; i++) { int num = (int) (Math.random() * 45)
		 * + 1; lotto.add(num); } System.out.println(lotto);
		 */

		// set을 만든다
		Set<Integer> iSet = new HashSet<Integer>();

		// 반복한다 (set 의 갯수가 6보다 적을때까지)
		while (true) {

			if (iSet.size() >= 6) {
				break;
			}
			// 번호를 생성한다
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);

			// set에 add한다
			iSet.add(num);
		}
		System.out.println("============================================");
		for (Integer num : iSet) {
			System.out.print(num + "\t");
		}
	}

}
