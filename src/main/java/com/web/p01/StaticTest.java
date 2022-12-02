package com.web.p01;

public class StaticTest {

	int num = 2;
	static int staticNum;

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.staticNum =2;
		System.out.println(st.staticNum);

		StaticTest st1 = new StaticTest();
		System.out.println(st1.staticNum);
	}

}
