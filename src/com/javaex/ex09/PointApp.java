package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		// <String=key, Point=value>
		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(3, 3);
		Point p02 = new Point(6, 9);
		Point p03 = new Point(14, 32);

		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);

		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		System.out.println(pMap.get("박명수").getX());

		Point p04 = new Point(100, 200);

		// 같은 'key'값으로 추가 시 --> info for key is updated
		pMap.put("정우성", p04);
		System.out.println(pMap.toString());

		System.out.println("=============================");

		// 전체출력
		// 1.key 목록을 만든다. ["정우성", "이효리", "박명수"}
		// 2.pMap.get("이름")
		Set<String> keys = pMap.keySet();
		System.out.println(keys.toString());

		for (String name : keys) {
			System.out.println(pMap.get(name).getX());
		}
	}
}
