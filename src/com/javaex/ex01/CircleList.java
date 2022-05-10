package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	// field
	private Circle[] cArray;
	private int crtPos; // 다음에 추가해줄 방번호

	// constructor
	public CircleList() {
		// 배열3개 --> 원래는 만들지 않음
		cArray = new Circle[3];
		crtPos = 0;
	}

	// method - g/s

	// method - general
	public int add(Circle circle) {
		// 현재배열갯수+1
		// 기존배열의 내용은 그대로 복사
		// 마지막방에 point를 대입
		cArray[crtPos] = circle;
		return crtPos = crtPos + 1;
	}

	public int size() {
		return crtPos;
	}

	public Circle get(int index) {
		return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}

}
