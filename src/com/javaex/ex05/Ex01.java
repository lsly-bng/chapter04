package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Set<Integer> iset = new HashSet<Integer>();

		// int i = 12;
		int i01 = 4;
		int i02 = 5;
		int i03 = 6;

		iset.add(i01);
		iset.add(i02);
		iset.add(i03);

		Integer i04 = 5;

		iset.add(i01);
		iset.add(i02);
		iset.add(i03);

		System.out.println(iset.size());
		System.out.println(iset.toString());
		System.out.println("================");

		for (Integer num : iset) {
			System.out.println(num.toString());
		}
		System.out.println("================");

		// 중복체크
		iset.add(i04);
		System.out.println("================");

		for (Integer num : iset) {
			System.out.println(num.toString());
		}
		System.out.println("================");
	}

}
