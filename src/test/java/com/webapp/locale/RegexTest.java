package com.webapp.locale;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	/*문자열 검색, 대체, 추출 ==> 정규표현식		
	 *
	 * .  => new line 문자를 제외한 모든문자
	 * ^  => Line start
	 * $  => Line End
	 * *  => 앞문자가 0 이상 반복
	 * +  => 앞문자가 1 이상 반복
	 * [AYZ] => one char 부분집합, A, Y, Z의 문자가 true
	 * [A-Z] => A부터 Z까지의 문자가 올수 있다
	 * {n} => 앞문자가 n개 반복
	 * {n,} => 앞문자가 n개 이상 반복
	 * {n, m} => 앞문자가    n <= 수 <= m
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/*		String regex = "^.$";*/
//		String regex = "^AB*$";
//		String regex = "^[A-Z0-9]{3,5}$"; //대문자와 0~9까지만 true
//		String regex = "^[가-힣]{3,5}$"; //한글만 true
//		String regex = "[A-Za-z]{3}";
		
		// 02-333-4444, 010-3333-4444, 011-333-4444
		
		String regex = "^[0-9]{2,3}$";
		String regex1 = "^[0-9]{3,4}$";
		String regex2 = "^[0-9]{4}$";
		while(true) {
			String line = sc.nextLine();
			
			String[] a = line.split("-");
			
			String a1 = a[1].trim();
			String a2 = a[2].trim();
			
			System.out.println("line: ["+ a[0] + "-" + a1 + "-" + a2 +"]");
			
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(a[0]);
			boolean b = m.find();
			
			Pattern pattern1 = Pattern.compile(regex1);
			Matcher m1 = pattern1.matcher(a1);
			boolean b1 = m1.find();
			
			Pattern pattern2 = Pattern.compile(regex2);
			Matcher m2 = pattern2.matcher(a2);
			boolean b2 = m2.find();
			
			if(b == true && b1 == true && b2 == true){			
				System.out.println("match: true");
			} else {
				System.out.println("match: false");
			}
			
			
		//	System.out.println("match: "+ Pattern.matches(regex, line));
		}
		
		
	}
}
