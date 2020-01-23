package com.ajnet.virtualcallendar;

import java.util.Scanner;

public class Calendar {
		
		public static final int [] maxday  = {31,28,31,30,31,30,31,31,30,31,30,31};
		public static final int [] maxday_leaf  = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		public static boolean isLeafYear(int year) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			    return true;
			} else {
				return false;
			}
		}
		public static int getMonthDays(int year, int month) {
		    if (isLeafYear(year)) {
			    return maxday_leaf[month-1];
			} else {
				return maxday[month-1];
			}
		}
		
		public void printCalendar(int year, int month) {
			System.out.printf("   <<%4d %3d>> \n", year, month);
			System.out.println(" 일 월 화 수 목 금 토");
			System.out.println("---------------------");
			
			int maxDay = getMonthDays(year, month);
				
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
			int year = 0;
			int month = 1;
			 
			while (true) {
				
				System.out.println("년도와 달을 입력하세요");
				System.out.print(PROMPT);
				String s1;
				String s2;
				s1 = sc.next();
				s2 = sc.next();
				year = Integer.parseInt(s1);
				month = Integer.parseInt(s2);
												
								
				if(month == -1) {
					break;
				}
				else if(month > 12){
				    continue;	
				}
				else 
				{
					cal.printCalendar(year, month);
				}
			}
			
			System.out.println("Bye~~");
			
		}
}
