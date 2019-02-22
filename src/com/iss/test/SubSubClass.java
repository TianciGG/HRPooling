package com.iss.test;

public class SubSubClass extends SubClass {

	static int a;

	public SubSubClass(int aa, int bb, int cc) {
		super(aa, bb, cc);
		a = aa + bb + cc;
	}

	static void show() {
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
	}

}
