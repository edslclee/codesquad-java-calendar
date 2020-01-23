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
		public static int parseDay(String week) {
			if(week == "일") {
					return 0;
				}
				else if (week == "월") {
					return 1;
				}else if(week=="화") {
					return 2;
				}else if(week=="수") {
					return 3;
			    }else if(week=="목") {
					return 4;
			    }else if(week=="금") {
					return 5;
			    }else{ 
			    	return 6;
			    }
	    }
		
		public void printCalendar(int year, int month, int weekday) {
			System.out.printf("   <<%4d %3d>> \n", year, month);
			System.out.println(" 일 월 화 수 목 금 토");
			System.out.println("---------------------");
			
			//print blank 
			for(int i = 0; i < weekday; i++) {
				System.out.printf("   ");
			}
			
			int maxDay = getMonthDays(year, month);
			
			//첫번째 줄 출력
			int count = 7 - weekday;
			
			for(int i = 1; i <= count; i++) {
				System.out.printf("%3d", i);
			}
			System.out.println();
			
			// 
			count++;
			
			for(int i = count; i <= maxDay; i++) {
				
				System.out.printf("%3d", i);
				
				if(i % 7 == count-1) {
					
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
				
				System.out.println("첫째날의 요일을 입력하세요(월, 화, 수, 목, 금, 토)");
				String str_weekDay;
				str_weekDay = sc.next();
				int weekday = parseDay(str_weekDay);
				
				System.out.println(str_weekDay + " , " + weekday);
					
								
				if(month == -1) {
					break;
				}
				else if(month > 12){
				    continue;	
				}
				else 
				{
					cal.printCalendar(year, month, weekday);
				}
			}
			
			System.out.println("Bye~~");
			sc.close();
		}
}
