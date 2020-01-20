package com.ajnet.callendar;

import java.util.Scanner;

public class PromptCalendar {
	
    public static final int [] maxday  = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int getMonthDays(int month) {
    	return maxday[month-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복횟수를 입력하세요");
		System.out.print(PROMPT);
		
		int repeat = sc.nextInt();
		
		for(int i=0; i < repeat; i++) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다\n", month, getMonthDays(month));
		}
		
	}

}
