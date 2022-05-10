package com.javaex.ex03;

public class MyList<T> {

	// field
	private T[] oArray;
	private int crtPos; // 다음에 추가해줄 방번호

	// constructor
	public MyList() {
		// 배열 3개 --> 원래는 만들지 않음
		oArray = (T[]) new Object[3];
		crtPos = 0; // 현재 위치를 나타내기 위한 값
	}

	// method - g/s

	// method - general
	public void add(T obj) {
		// 현재배열갯수+1
		// 기존배열의 내용은 그대로 복사
		// 마지막방에 point를 대입
		oArray[crtPos] = obj;
		crtPos = crtPos + 1; // crtPos++ --> 이렇게 적어도 똑같음
	}

	public int size() {
		return crtPos;
	}

	public T get(int index) {
		return oArray[index];
	}
}
