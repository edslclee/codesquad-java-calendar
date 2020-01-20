package com.ajnet.callendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		String s1;
		String s2;
		s1 = sc.next();
		s2 = sc.next();
		System.out.println(s1 + " , " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println("두수의 합은 " + (a+b) + "입니다");
		System.out.printf("두수의 합은 %d입니다", (a+b));
	}

}
