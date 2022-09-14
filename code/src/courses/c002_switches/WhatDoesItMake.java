package courses.c002_switches;

public class WhatDoesItMake {
	public static void main(String args[]) {
		int n = 5;
		int a = 2;
		int e = 0;
		
		for (a = 3; a < n + 1; e++) {
			System.out.println(a - 1);
			a = a + 1;
		}
		
		System.out.println(e);
	}
}
