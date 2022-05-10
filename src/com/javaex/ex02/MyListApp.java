package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {

		// Point 관리
		MyList pList = new MyList();
		Point p01 = new Point(2, 3);
		Point p02 = new Point(12, 13);

		pList.add(p01);
		pList.add(p02);

		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());

		System.out.println("===========================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
			Point p = (Point) pList.get(i);
			System.out.println(p.getX());
		}
		System.out.println("===========================");

		// Circle 관리
		MyList cList = new MyList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(9);

		cList.add(c01);
		cList.add(c02);
		cList.add(p01);

		System.out.println(cList.size());
		System.out.println(cList.get(0).toString());
		System.out.println("===========================");

		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			// System.out.println(((Circle) cList.get(i)).getRadius());
		}
		System.out.println("===========================");
	}
}
