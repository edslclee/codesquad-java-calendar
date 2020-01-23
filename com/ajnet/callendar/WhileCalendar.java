package com.ajnet.callendar;

import java.util.Scanner;

public class WhileCalendar {

	public static final int [] maxday  = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static int getMonthDays(int month) {
	    return maxday[month-1];
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d %3d>> \n", year, month);
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("---------------------");
		
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		int maxDay = getMonthDays(month);
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = 1;
		
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12){
			    continue;	
			}
			else 
			{
				System.out.printf("%d월은 %d일까지 있습니다\n", month, getMonthDays(month));
			}
		}
		
		System.out.println("Bye~~");
		
	}


}
